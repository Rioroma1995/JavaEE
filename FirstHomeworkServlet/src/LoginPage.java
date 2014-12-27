import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginPage extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
		rd.include(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String error = null;
		PrintWriter out= response.getWriter();
		if (login == null || login.equals("")) 
			error = "Login can't be empty";
		else if (password == null || password.equals("")) 
			error = "Password can't be empty";
		if (error != null&&!error.equals("")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");           
            out.println("<font color=red>"+error+"</font>");
            rd.include(request, response);
		} else 
			if(!login.toLowerCase().equals(((String) getServletContext().getInitParameter("userLogin")).toLowerCase())||!password.toLowerCase().equals(((String) getServletContext().getInitParameter("userPassword")).toLowerCase())){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
				out.println("<font color=red>" + "User doesn't exist" + "</font>");
				rd.include(request, response);
				}
			else{
				HttpSession session = request.getSession();
                session.setAttribute("login", login);
				response.sendRedirect("/FirstHomeworkServlet/Hello");
			}
		out.close();
	}
}
