package First;

public class SimpleBMVDriver implements ICarDriver{
	private String name = "�����";
	public SimpleBMVDriver(){}
	public SimpleBMVDriver(String name){
		this.name = name;
	}
	public void drive() {
		System.out.println("�, "+name+", ����� ���");
	}
	public void setName(String name){
		this.name = name;
	}
}
