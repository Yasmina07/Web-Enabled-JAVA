package a1q7;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/datetime")

public class dt extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException{
			 res.setIntHeader("refresh", 1);
			 res.setContentType("text/html");
			 PrintWriter out=res.getWriter();
			 java.util.Date date=new java.util.Date();
			 out.println("<html><body bgcolor='white'>");
			 out.println("<h1 style='color:black;textalign:center'>"+date+"</h1>"); 
			 
			 out.println("</body></html>"); 
			 }

}
