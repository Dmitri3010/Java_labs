import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class CBean extends HttpServlet {
    att at;

    public CBean() {
    }

    public void initt() throws ServletException {
        this.at = new att("qwerty");
        ServletContext var1 = this.getServletContext();
        var1.setAttribute("adr_att", this.at);
    }

    protected void setik(String var1) {
        this.at.SetS(var1);
        ServletContext var2 = this.getServletContext();
        var2.removeAttribute("adr_att");
        var2.setAttribute("adr_att", this.at);
    }

    protected void del() {
        ServletContext var1 = this.getServletContext();
        var1.removeAttribute("adr_att");
    }

    protected void doPost(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        String var3 = "";
        var3 = var3 + var1.getParameter("CB");
        String var4 = "";
        var4 = var4 + var1.getParameter("v1");
        PrintWriter var5 = var2.getWriter();
        ServletContext var6 = this.getServletContext();
        if (var3.equalsIgnoreCase("new")) {
            this.initt();
        }

        if (var3.equalsIgnoreCase("del")) {
            this.del();
        }

        if (!var4.equals("null")) {
            this.setik(var4);
        }

        Enumeration var7 = var6.getAttributeNames();
        var5.println("CB=" + var3 + ' ' + "v1=" + var4);
        var5.println("<html><body>");

        while(var7.hasMoreElements()) {
            String var8 = (String)var7.nextElement();
            var5.println("<br/>" + var8 + "=" + var6.getAttribute(var8));
        }

        var5.println("</body></html>");
    }
}
