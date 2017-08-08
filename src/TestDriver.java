
public class TestDriver {

	public static void main(String[] args) {
		MallardDuck d1 = new MallardDuck();
		d1.setQuackBehavior(new Squeak());
		d1.performQuack();   //Quack! Quack!
		d1.display(); //Look like a mallard
		d1.performFly(); // I'm flying with wing
		RubberDuck d2 = new RubberDuck();
		d2.performQuack();  //Squeak! Squeak!
		d2.display(); //Look like a rubber
		d2.performFly(); //I'm flying with rocket
	}

}
