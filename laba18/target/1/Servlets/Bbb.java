

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Bbb
 */
@WebServlet("/Bbb")
public class Bbb extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bbb() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.addHeader("responseHeader1", "responseHeader1");//создаём заголовки
        response.addHeader("responseHeader2", "responseHeader2");

        PrintWriter pw = response.getWriter();// получаем объект который выводит
        String s;
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        Enumeration params = request.getParameterNames();// получаем параметры ответа

        while (params.hasMoreElements()) {
            s = (String) params.nextElement();
            pw.println("<br />" + s + "= " + request.getParameter(s));
        }//выводим параметры

        Enumeration enh = request.getHeaderNames();
        while (enh.hasMoreElements()) {
            s = (String) enh.nextElement();
            pw.println("<br />" + s + "= " + request.getHeader(s));
        }//выводим заголовки

    }

}
