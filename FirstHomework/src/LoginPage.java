import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final String USERLOGIN = "Roma";
	private static final String USERPASSWORD = "1111";
	
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginPage() {
		super();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
		rd.include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String error = null;
		PrintWriter out= response.getWriter();
		if (login == null || login.equals("")) {
			error = "Login can't be empty";
		}
		else if (password == null || password.equals("")) {
			error = "Password can't be empty";
		}
		if (error != null&&!error.equals("")) {
			RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");           
            out.println("<font color=red>"+error+"</font>");
            rd.include(request, response);
		} else {
			if(!login.toLowerCase().equals(USERLOGIN.toLowerCase())||!password.toLowerCase().equals(USERPASSWORD.toLowerCase())){
				RequestDispatcher rd = getServletContext().getRequestDispatcher("/Login.html");
				out.println("<font color=red>" + "User doesn't exist" + "</font>");
				rd.include(request, response);
				}
			else{
				HttpSession session = request.getSession();
                session.setAttribute("login", login);
				response.sendRedirect("/FirstHomework/Hello");
			}
		}
		out.close();
	}
}
