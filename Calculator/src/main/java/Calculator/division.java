package Calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/div")
public class division implements Servlet {

	
	static{
		System.out.println("division class got Loaded");
		
	}
	public void destroy() {
		System.out.println("division class got destroyed");
		
	}

	public ServletConfig getServletConfig() {
		
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init method got invoked");
		
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is called");
		double a =Double.parseDouble(req.getParameter("no1"));
		int b =Integer.parseInt(req.getParameter("no2"));
		double ress=a/b;
		res.getWriter().print("<h1>The answer is "+ress+"</h1>");
	}
}