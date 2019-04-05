import com.github.sardine.DavResource;
import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import java.net.HttpURLConnection;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;


public class Upload extends HttpServlet{
   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Sardine sardine = SardineFactory.begin("lipov758@gmail.com", "Azaza7788");
       sardine.createDirectory("https://webdav.opendrive.com/llo");
       String fname = "lololo";
       String URL = "https://webdav.yandex.ru/";

//       byte[] data = FileUtils.readFileToByteArray(new File("D:\\Download\\2_test.docx"));
//       sardine.put("https://webdav.yandex.ru", data);

    }
    }

