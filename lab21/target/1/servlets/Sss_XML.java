import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Sss_XML extends javax.servlet.http.HttpServlet implements
		javax.servlet.Servlet {
	Integer n=null;
	private Random r = new Random();
	static final long serialVersionUID = 1L;
   	public Sss_XML() {
		super();
	}
   	
   	public Integer Get() {
		return (this.r.nextInt()%this.n);
	}
   	
	protected void service(HttpServletRequest rq, HttpServletResponse rs)
			throws ServletException, IOException {
		rs.setCharacterEncoding("UTF-8");
		System.out.println("Sss_Rand:doPost");
		n = new Integer(rq.getHeader("XRand-N"));
		System.out.println(n);
		rs.setContentType("text/xml");
		PrintWriter w = rs.getWriter();
		String s = "<rand>" ;
		double ran = Math.random()*(10-4)+4;
		for (int i = 0; i < ran; i++)
		{
			s += "<num>"+Get().toString()+"</num>";
		}
		s += "</rand>";
		 try {
				Thread.currentThread().sleep(5000);
			 } 
		 catch (Exception e) 
		     {
				 System.out.println(e);
			 }
		w.println(s);
		w.flush();
	}
}	    

