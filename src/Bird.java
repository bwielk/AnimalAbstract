
public abstract class Bird extends Animal implements Flyable{

	public Bird(String name) {
		super(name);
	}

	public void eat() {
		System.out.println(getName() + " bird is pecking");
	}

	public void breathe() {
		System.out.println(getName() + " bird is breathing");
	}
	
	public void fly(){
		System.out.println(getName() + " is flapping its wings");
	}
}
