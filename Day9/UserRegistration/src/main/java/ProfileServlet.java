

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
public class ProfileServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		request.getRequestDispatcher("link.html").include(request, response);
		
		HttpSession session=request.getSession(false);
		if(session!=null){
		String name=(String)session.getAttribute("name");
		out.print("<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css' integrity='sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO' crossorigin='anonymous'>");
		out.print("<h1 class='bg bg-primary'>Welcome </h1>"+name+"<h1 class='bg bg-primary'> to your Profile</h1>");
		out.println("<div class='p-3 mx-auto bg bg-success' style='width:auto'>	<h1>User <span class='text-white'>Login/Logout</span> Servlet</h1> </div>	<nav class='navbar navbar-expand-sm navbar-dark bg-dark'> <ul class=' navbar-nav mr-auto'>   <li class='nav-item'>    <a class='nav-link' href='login.html'>Login</a>   </li>   <li class='nav-item'>     <a class='nav-link' href='logoutServlet'>Logout</a>  </li> <li class='nav-item'> <a class='nav-link' href='ProfileServlet'>Profile</a> </li> </ul>	</nav>");
		}
		else{
			out.print("<h1 class='text-light'>Please login first</h1>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		out.close();
	}
}
