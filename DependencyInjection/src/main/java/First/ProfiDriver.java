package First;
public class ProfiDriver implements ICarDriver {
	private String name = "�����";
	private ICar car;
	public ProfiDriver() {
	}
	public ProfiDriver(String name) {
		this.name = name;
	}
	public void drive() {
		System.out.println("�, " + name + ", ����� " + car.carName());
	}
	public void setCar(ICar car) {
		this.car = car;
	}
	public void setName(String name) {
		this.name = name;
	}
}
