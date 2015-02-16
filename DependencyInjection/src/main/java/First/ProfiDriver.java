package First;
public class ProfiDriver implements ICarDriver {
	private String name = "Анонім";
	private ICar car;
	public ProfiDriver() {
	}
	public ProfiDriver(String name) {
		this.name = name;
	}
	public void drive() {
		System.out.println("Я, " + name + ", воджу " + car.carName());
	}
	public void setCar(ICar car) {
		this.car = car;
	}
	public void setName(String name) {
		this.name = name;
	}
}
