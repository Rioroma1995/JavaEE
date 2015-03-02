package First;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester 
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
		IText book = (IText)context.getBean("book");
		
		BookReader reader = (BookReader)context.getBean("reader");
		book.setText("text in the book");
		System.out.println(reader.getReadText());
		
		SuperBookReader superReader = (SuperBookReader)context.getBean("superReader");
		book.setText("super text in the book");
		System.out.println(superReader.getReadText());
	}
}
