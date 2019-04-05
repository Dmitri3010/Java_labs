import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class sydaidi extends HttpServlet implements Servlet{
	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException{
	
	PrintWriter pw=rs.getWriter();
	pw.println("<html><body><br>Surname="+rq.getParameter("surname")+"<br>lastname="+rq.getParameter("lastname")+"</body></html>");
	pw.close();
	}
}
