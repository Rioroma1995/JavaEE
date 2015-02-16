package First;
import java.util.Collection;
public class SuperDriver implements ICarDriver {
	private String name = "�����";
	public SuperDriver() {
	}
	public SuperDriver(String name) {
		this.name = name;
	}
	public void drive() {
		for (ICar car : cars) 
			System.out.println("�, " + name + ", ����� " + car.carName());
	}
	public void setName(String name) {
		this.name = name;
	}
	private Collection<ICar> cars;
	public void setCars(Collection<ICar> cars) {
		this.cars = cars;
	}
}
