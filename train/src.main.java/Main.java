import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import src.main.java.Train;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		Train trainInt = (Train)context.getBean("Lviv");
		trainInt.drive();
        Train trainFre = (Train)context.getBean("Kharkiv");
        trainFre.drive();
	}

}
