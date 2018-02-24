
public class Ostrich extends Bird {

	public Ostrich(String name) {
		super(name);
	}

	public void fly() {
		super.fly();
		System.out.println(getName() + " is not very good at flying");
	}
}