import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Hello extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session==null||session.getAttribute("login") == null)
			response.sendRedirect("/FirstHomeworkServlet/LoginPage");
		//Для коректної роботи кноки "Logout". 
		//Щоб сторінка не кешувалась і після натисканні на кнопку "Назад" в браузері, 
		//нас не повертало на сторінку користувача, коли ми вже розлогінились.
		response.setHeader("Cache-Control", "no-store");
		response.setHeader("Pragma", "no-cache");
		response.setDateHeader("Expires", 0);
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("Hello, " + session.getAttribute("login"));
		out.println("<form name=\"logout\" method=\"post\"><input type=\"submit\" value=\"Logout\">");
		out.close();
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("/FirstHomeworkServlet/LoginPage");
		request.getSession().setAttribute("login", null);
	}
}
