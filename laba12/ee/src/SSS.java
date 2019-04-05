
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;


public class SSS extends HttpServlet {
    private  static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        InetAddress ip;
        String hostname;
        ip = InetAddress.getLocalHost();
        hostname = ip.getHostName();
        response.setContentType("text/html");
        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");
        PrintWriter out = response.getWriter();
        out.println("<h3>Hello World!</h3>");
        out.println("<h3> ip: "+ip+"</h3>");
        out.println("<h3> hostname: "+hostname+"</h3>");
        out.println("<h3> name: "+name+"</h3>");
        out.println("<h3> lastname: "+lastname+"</h3>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String lastname = request.getParameter("lastname");


        try {
            writer.println("<p>Name: " + name + "</p>");
            writer.println("<p>Lastname: " + lastname + "</p>");


        } finally {
            writer.close();
        }
    }

    public SSS(){
        super();
        try(PrintWriter pw = new PrintWriter(System.out))
        {
            pw.println("<h2>Hello from HelloServlet</h2>");
        }

    }

    public void Init(ServletConfig servletConfig) throws ServletException{
        System.out.println("Init");
    }

    public void Destroy(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        System.out.println("<h1>Destroy</h1>");
    }

    protected void Service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        try {
            writer.println("<h2>Hello from HelloServlet</h2>");
        } finally {
            writer.close();
        }

    }

}
