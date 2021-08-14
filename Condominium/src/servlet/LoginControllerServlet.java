package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.dao.LoginDAO;

@WebServlet("/Login")
public class LoginControllerServlet extends HttpServlet 
{
	public static final long serialVersionUID = 1L;
	
	public LoginControllerServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("uname");
		String pass = request.getParameter("pass");
		
		LoginDAO dao = new LoginDAO();
		
		
		try {
			if(dao.checkLogin(email, pass))
			{
				HttpSession session = request.getSession();
				session.setAttribute("username", email);
				response.sendRedirect("HomePage.jsp");
			}
			else
			{
				response.sendRedirect("Login.jsp");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}