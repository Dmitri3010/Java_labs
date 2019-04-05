import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class SSS extends HttpServlet{

        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            HttpSession session = request.getSession();
            Person tom = (Person) session.getAttribute("person");

            PrintWriter out = response.getWriter();
            try {
                if(tom == null) {

                    tom = new Person("Dimas Killer", 34);
                    session.setAttribute("person", tom);
                    out.println("Session data are set");
                }
                else {
                    out.println("Name: " + tom.getName() + " Age: " + tom.getAge());
                    session.removeAttribute("person");
                }
            }
            finally {
                out.close();
            }
        }
}
