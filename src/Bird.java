
public abstract class Bird extends Animal {

	public Bird(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(getName() + " bird is pecking");
	}

	public void breathe() {
		System.out.println(getName() + " bird is breathing");
	}
	
	public abstract void fly();
}
