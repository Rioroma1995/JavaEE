package First;

import org.aspectj.lang.annotation.*;

@Aspect
public class SuperBookReader implements ITextReader{
	private String readText;
	@Pointcut("execution(* First.Book.setText(String)) && args(text)")
	public void superReading(String text){}

	@Before("superReading(text)")
	public void read(String text) {
		System.out.println("SuperBookReader читає текст");
		this.readText = text;
	}

	public String getReadText() {
		return readText;
	}

}
