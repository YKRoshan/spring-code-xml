import com.stackroute.demo.BeanLifecycleDemoBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
    public static void main(String [] args){

        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        context.close();
    }
}