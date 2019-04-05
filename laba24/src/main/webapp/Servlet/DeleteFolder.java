import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteFolder extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Sardine sardine = SardineFactory.begin("lipov758@gmail.com", "Azaza7788");
        sardine.delete("https://webdav.opendrive.com/lolo/2_test.docx");


//       byte[] data = FileUtils.readFileToByteArray(new File("D:\\Download\\2_test.docx"));
//       sardine.put("https://webdav.yandex.ru", data);

    }
}

