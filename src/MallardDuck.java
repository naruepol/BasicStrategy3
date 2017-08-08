
public class MallardDuck extends Duck {

	MallardDuck(){
		flyBehavior = new FlyWithWing();
		quackBehavior  = new Quack();
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Look like a mallard");
	}

}
