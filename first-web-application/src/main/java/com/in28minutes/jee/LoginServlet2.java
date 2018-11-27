package com.in28minutes.jee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.UserValidationService;

@WebServlet(urlPatterns="/login2.do")
public class LoginServlet2 extends HttpServlet {

	UserValidationService userValidationService = new UserValidationService();
	
	@Override
	protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(httpServletRequest, httpServletResponse);
		
		String name = httpServletRequest.getParameter("name");
		httpServletRequest.setAttribute("name", name);
		
		String password = httpServletRequest.getParameter("password");
		httpServletRequest.setAttribute("password", password);
		
		
		httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp")
		.forward(httpServletRequest, httpServletResponse);
		
		/*PrintWriter out = httpServletResponse.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Yahoo!!!!!!!!</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("My First Servlet");
		out.println("</body>");
		out.println("</html>");
		*/
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user = request.getParameter("name");
		String password = request.getParameter("password");
		
		if ( userValidationService.isValidateUser(user, password))
		{
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp")
			.forward(request, response);
		}
		else
		{
			request.setAttribute("error", "Invalid User");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp")
			.forward(request, response);
			
		}	
		
	}

	
	
}
