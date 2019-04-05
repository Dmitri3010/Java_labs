import com.github.sardine.Sardine;
import com.github.sardine.SardineFactory;
import org.apache.commons.io.FileUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

public class Send extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Sardine sardine = SardineFactory.begin("lipov758@gmail.com", "Azaza7788");
       byte[] data = FileUtils.readFileToByteArray(new File("D:\\Download\\2_test.docx"));
       sardine.put("https://webdav.opendrive.com/lolo/2_test.docx", data);

    }
}