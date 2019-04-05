import java.io.*;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SUpload
 */
@WebServlet("/SUpload")
public class SUpload extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final int CR = (int) '\r';
    private static final int LF = (int) '\n';


    public SUpload() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        PrintWriter pw = response.getWriter();

        Enumeration<String> e = request.getHeaderNames();

        String param;

        pw.println("<!DOCTYPE html>");
        pw.println("<head>");
        pw.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
        pw.println("<title>lab23</title>");
        pw.println("</head>");
        pw.println("<body>");
        pw.println("<table>");

        while (e.hasMoreElements()) {
            param = e.nextElement().toString();

            pw.println("<tr>");
            pw.println("<td>" + param + "</td><td>" + request.getHeader(param)
                    + "</td>");
            pw.println("</tr>");
        }

        pw.println("</table>");
        pw.println("</body>");
        pw.flush();

        this.InputDoc(request);
    }

    protected void InputDoc(HttpServletRequest request)
            throws IOException {
        StringBuffer buf = new StringBuffer("");


        String folder = request.getServletContext().getInitParameter("doc-dir");
        String file;

        int[] dataSlice = extractData(request, buf);

        file = buf.substring(buf.indexOf("filename=\"") + 10, buf.indexOf("\"", buf.indexOf("filename=\"")+10));

        FileOutputStream fos = new FileOutputStream(folder + "\\" + file);
        int i;
        for(i=0; i < dataSlice.length; fos.write(dataSlice[i++]));
        fos.flush();
        fos.close();
    }

    private int[] extractData(HttpServletRequest request, StringBuffer buf) throws IOException {
        // ���������� ��������� ������ �� ������� (���������� ����������� �����)
        InputStream is = request.getInputStream();
        int[] data = new int[request.getContentLength()];
        int bytes;
        int counter = 0;
        while ((bytes = is.read()) != -1) {
            data[counter] = bytes;
            counter++;
        }
        is.close();

        // ����������� �������� ������
        int i;
        int beginSliceIndex = 0;
        // �������� ������ ������ - ����� ������� + ���. �������.
        int endSliceIndex = data.length - getBoundary(request).length() - 9;

        for (i = 0; i < data.length; i++) {
            buf.append((char)data[i]);
            // ��������� ������ ������: ����� ���� ��� ���������� 2 ���� ������
            // \r\n
            if (data[i] == CR && data[i + 1] == LF && data[i + 2] == CR
                    && data[i + 3] == LF) {
                beginSliceIndex = i + 4;
                break;
            }
        }

        int[] dataSlice = new int[endSliceIndex - beginSliceIndex + 1];
        for (i = beginSliceIndex; i <= endSliceIndex; i++) {
            dataSlice[i - beginSliceIndex] = data[i];
        }

        return dataSlice;
    }

    // ����� �������
    private String getBoundary(HttpServletRequest request) {
        String cType = request.getContentType();
        return cType.substring(cType.indexOf("boundary=") + 9);
    }

}
