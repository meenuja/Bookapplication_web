package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logincontroller
 */
@WebServlet("/Logincontroller")
public class Logincontroller extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("LoginUserController");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		out.println("email="+email);
		out.println("password="+password);
		UserDAO userDAO=new UserDAO();
		User user = null;
		
		try{
			user = userDAO.login(email, password);
			
		    }catch(Exception e){
			e.printStackTrace();
		}
		out.println("user="+ user);
		if(user==null)
		{
			response.sendRedirect("login.jsp");
		}
		else
		{
			HttpSession session= String arg
			response.sendRedirect("listbooks.jsp");
			
		}

	}

}
