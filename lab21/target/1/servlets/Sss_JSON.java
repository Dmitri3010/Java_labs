import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Sss_JSON extends javax.servlet.http.HttpServlet
                                     implements javax.servlet.Servlet {
   Integer n=null;
   private Random r = new Random();

   public Sss_JSON() {
       super();
   }
   public Integer Get() {
       return (this.r.nextInt()%this.n);
   }

   protected void service(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
       System.out.println("Sss_JSON:doPost");
       n = new Integer(rq.getHeader("XRand-N"));
       System.out.println(n);
       rs.setContentType("text/xml");
       PrintWriter w = rs.getWriter();
       String s ="{\"X\":[" ;
       double ran = Math.random()*(10-4)+4;
       for (int i = 0; i < ran; i++)
       {
           s += ("{\"rand\":"+ Get().toString()+"}"+ ((i < ran-1)?",":" "));
       }
       s+="]}";
        try {
               Thread.currentThread().sleep(1000);
            }
        catch (Exception e)
            {
                System.out.println(e);
            }

       w.println(s);
   }

}
