
public class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	
	public void eat(){
		System.out.println(getName() + " dog is eating");
	}
	
	public void breathe(){
		System.out.println(getName() + " dog is breathing");
	}
}
