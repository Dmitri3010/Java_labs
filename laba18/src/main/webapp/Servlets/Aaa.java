

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;


/**
 * Servlet implementation class Aaa
 */
@WebServlet("/Aaa")
public class Aaa extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Aaa() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
     */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = this.getServletContext();
        String serv = sc.getInitParameter("Server");

        String param = null;

        URL url = new URL(serv + request.getContextPath() + "/Bbb");
        URLConnection con = url.openConnection();
        HttpURLConnection http = (HttpURLConnection) con;
        http.setRequestMethod("POST"); // PUT is another valid option
        http.setDoOutput(true);
        byte[] out = "{\"username\":\"root\",\"password\":\"password\"}".getBytes(StandardCharsets.UTF_8);
        int length = out.length;

        http.setFixedLengthStreamingMode(length);
        http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        http.connect();
        try (OutputStream os = http.getOutputStream()) {
            os.write(out);
        }

//		DefaultHttpClient hc = new DefaultHttpClient();
//
//		HttpPost pm = new HttpPost(serv + request.getContextPath() + "/Bbb");//метод httppost
//
//		List <NameValuePair> parameters = new ArrayList <NameValuePair>();//для передачи параметров в httppost
//
//		Enumeration params = request.getParameterNames();//перечисление параметров request
//
//		while (params.hasMoreElements()) {
//			param = (String) params.nextElement();
//			parameters.add(new BasicNameValuePair(param, request.getParameter(param)));
//		}//выводим полученные параметры
//
//
//		pm.setEntity(new UrlEncodedFormEntity(parameters, HTTP.UTF_8));
//
//		pm.addHeader("Header1", "Header1"); //дописываем дополнительные заголовка в httppost
//		pm.addHeader("Header2", "Header2");
//		pm.addHeader("Header3", "Header3");

//		HttpResponse resp = hc.execute(pm);//ответ
//		HttpEntity resEntity = resp.getEntity();//создаем объект в который записывается ответ
//
//		String a = EntityUtils.toString(resEntity); //записываем объект в строку
//
//		response.setContentType("text/html");
//		response.setCharacterEncoding("UTF-8");
//
//		PrintWriter pw = response.getWriter();//получаем ссылку на объкт, для вывода
//
//		pw.println("<!DOCTYPE html><html><head><meta charset=\"UTF-8\"><title>Lab18</title></head>");
//		pw.println("<h1>Response Params</h1><hr>");
//
//		Header[] rparams = resp.getAllHeaders();//получаем все заголовки
//
//		int i = 0;
//		while (i < rparams.length) {
//			pw.println("<br />" + rparams[i].getName() + "= " + rparams[i++].getValue());
//		}
//		pw.println("<h1>Request Params</h1><hr>");
//		pw.println(a);
//		pw.println("<hr></body></html>");
//		pw.flush();
//	}

    }}
