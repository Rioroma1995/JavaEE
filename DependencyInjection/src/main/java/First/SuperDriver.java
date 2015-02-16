package First;
import java.util.Collection;
public class SuperDriver implements ICarDriver {
	private String name = "Анонім";
	public SuperDriver() {
	}
	public SuperDriver(String name) {
		this.name = name;
	}
	public void drive() {
		for (ICar car : cars) 
			System.out.println("Я, " + name + ", воджу " + car.carName());
	}
	public void setName(String name) {
		this.name = name;
	}
	private Collection<ICar> cars;
	public void setCars(Collection<ICar> cars) {
		this.cars = cars;
	}
}
