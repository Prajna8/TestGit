

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/login") 
public class login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	String uname=request.getParameter("uname");
	String pass=request.getParameter("pass");
	
	if(uname.equals("prajna8@gmail.com") && pass.equals("niit"))
	{
		response.sendRedirect("NewFile.html");
	}
		
	}


}
