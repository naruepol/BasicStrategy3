
public abstract class Duck {
	Flyable flyBehavior;
	Quackable quackBehavior;
	
	void performFly(){
		flyBehavior.fly();
	}
	
	void performQuack(){
		quackBehavior.quack();
	}
	
	void swim(){
		System.out.println("I'm swimming");
	}
	
	abstract void display();
}
