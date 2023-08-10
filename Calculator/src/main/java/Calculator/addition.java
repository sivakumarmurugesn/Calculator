package Calculator;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/add")
public class addition implements Servlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

//		System.out.println(req.getParameter("no1"));
		
		int a = Integer.parseInt(req.getParameter("no1"));
		int b = Integer.parseInt(req.getParameter("no2"));
		res.getWriter().println("The sum of " + a + " and " + b + "is" + (a + b));

	}

}
