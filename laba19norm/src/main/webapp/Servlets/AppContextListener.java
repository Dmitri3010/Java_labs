import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener

public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized (ServletContextEvent event) {
        System.out.println("context initialized " + this);

    }

    @Override
    public void contextDestroyed (ServletContextEvent sce) {
        System.out.println("context destroy " + this);
    }
}