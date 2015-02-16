package First;

public class SimpleBMVDriver implements ICarDriver{
	private String name = "Анонім";
	public SimpleBMVDriver(){}
	public SimpleBMVDriver(String name){
		this.name = name;
	}
	public void drive() {
		System.out.println("Я, "+name+", воджу БМВ");
	}
	public void setName(String name){
		this.name = name;
	}
}
