package First;

public class Book implements IText{
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}
}
