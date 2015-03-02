package First;

public class BookReader implements ITextReader{
	private String readText;

	public void read(String text) {
		System.out.println("BookReader читає текст");
		this.readText = text;
	}

	public String getReadText() {
		return readText;
	}

}
