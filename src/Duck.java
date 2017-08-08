
public abstract class Duck {
	Flyable flyBehavior;
	Quackable quackBehavior;
	
	void performFly(){
		flyBehavior.fly();
	}
	
	void performQuack(){
		quackBehavior.quack();
	}
	
	void setQuackBehavior(Quackable qb){
		quackBehavior = qb;
	}
	
	void swim(){
		System.out.println("I'm swimming");
	}
	
	abstract void display();
}
