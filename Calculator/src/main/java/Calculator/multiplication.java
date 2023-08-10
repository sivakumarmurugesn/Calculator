package Calculator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class multiplication extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	int a =Integer.parseInt(req.getParameter("no1"));
	int b =Integer.parseInt(req.getParameter("no2"));
	int ress=a*b;
	//res.getWriter().print("the mul of " + a + " and " + b + " is " + (a * b));
	res.getWriter().print("<html><body><h1 style='color:blue'>the mul of " +a+ " and "+b+ " is "+ress+"</h1></body></html>");
}	
}
