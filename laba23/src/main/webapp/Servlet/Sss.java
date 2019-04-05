
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
/**
 * Servlet implementation class Sss
 */
@WebServlet("/Sss")
public class Sss extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sss() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    @SuppressWarnings("deprecation")
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servlet:SSS");

        String file = request.getParameter("file");
        String folder = request.getServletContext().getInitParameter("doc-dir");

        Date d = new Date();
        System.out.println(d.toLocaleString() + " " + file);

        File f = new File(folder + "\\" + file);
        this.OutputDoc(f, response);
    }
    //������� ������������ ������� Word-����
    protected void OutputDoc(File doc, HttpServletResponse rs) throws IOException {
        rs.setContentType("application/msword");
        rs.addHeader("Content-Disposition", "attachment; filename=" + doc.getName());
        rs.setContentLength((int) doc.length());

        FileInputStream in = new FileInputStream(doc);
        BufferedInputStream buf = new BufferedInputStream(in);
        ServletOutputStream out = rs.getOutputStream();
        int readBytes = 0;
        while ((readBytes = buf.read()) != -1)
            out.write(readBytes);
    }

}
