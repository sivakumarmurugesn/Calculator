package Calculator;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/sub")
public class substraction extends GenericServlet {
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int a =Integer.parseInt(req.getParameter("no1"));
		int b =Integer.parseInt(req.getParameter("no2"));
		int ress=a-b;
		res.getWriter().print("the sub of " + a + " and " + b + " is " + (a - b));
		res.getWriter().print("<html><body><h1 style='color:blue'>the sub of " +a+ " and "+b+ " is "+ress+"</h1></body></html>");
		
	}

}
