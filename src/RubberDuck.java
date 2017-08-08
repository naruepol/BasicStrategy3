
public class RubberDuck extends Duck {

	RubberDuck(){
		flyBehavior = new FlyWithRocket();
		quackBehavior = new Squeak();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Look like a rubber");
	}

}
