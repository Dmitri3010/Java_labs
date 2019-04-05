import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sss_Header extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Sss_Header() {
        super();
    }

    protected void service(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
        System.out.println("Sss:doPost");
        System.out.println(rq.getHeader("Value-X"));
        System.out.println(rq.getHeader("Value-Y"));
        Float x = new Float(rq.getHeader("Value-X"));
        Float y = new Float(rq.getHeader("Value-Y"));
        Float z = x + y;
        try {
            Thread.currentThread().sleep(10000);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        rs.setHeader("Value-Z", z.toString());
    }
}