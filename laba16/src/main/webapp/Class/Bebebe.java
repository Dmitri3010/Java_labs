import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Bebebe extends HttpServlet  {
    public Bebebe() {
    }

    protected void doGet(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        ServletContext var3 = this.getServletContext();
        String var4 = "";
        var4 = var4 + var3.getInitParameter("urik");
        PrintWriter var5 = var2.getWriter();
        if (!var4.equalsIgnoreCase("null")) {

        } else {
            var5.println("not found");
        }

        var5.flush();
    }
}
