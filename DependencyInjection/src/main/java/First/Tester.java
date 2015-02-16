package First;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Tester 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		ICarDriver obj1 = (ICarDriver) context.getBean("driver1");
		obj1.drive();
		ICarDriver obj2 = (ICarDriver) context.getBean("driver2");
		obj2.drive();
		ICarDriver obj3 = (ICarDriver) context.getBean("driver3");
		obj3.drive();
		ICarDriver obj4 = (ICarDriver) context.getBean("driver1");
		obj4.drive();
		ICarDriver obj5 = (ICarDriver) context.getBean("profidriver");
		obj5.drive();
		ICarDriver obj6 = (ICarDriver) context.getBean("superdriver");
		obj6.drive();
		}

}
