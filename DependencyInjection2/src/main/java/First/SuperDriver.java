package First;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class SuperDriver implements ICarDriver {
	private String name = "Анонім";
	private ICar car;
	public SuperDriver() {
	}
	public SuperDriver(String name) {
		this.name = name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void drive() {
		System.out.println("Я, " + name + ", воджу " + car.carName());
	}
	@Autowired
	public void setCar(ICar car) {
		this.car = car;
	}
}
