
public class Main {
	
	public static void main(String[] args){
		Animal dog1 = new Dog("Max");
		dog1.eat();
		dog1.breathe();
		
		Bird bird1 = new Parrot("Aussie");
		bird1.eat();
		bird1.breathe();
		bird1.fly();
		
		Bird bird2 = new Ostrich("Ostrick");
		bird2.eat();
		bird2.breathe();
		bird2.fly();
	}
}
