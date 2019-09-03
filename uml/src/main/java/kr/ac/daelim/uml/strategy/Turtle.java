package kr.ac.daelim.uml.strategy;

public class Turtle extends Animal{

	Fly fly;
	Cry cry;
	
	
	public Turtle() {
		cry = new CryNoWay();
		fly = new FlyNoWay();
	}
	
	@Override
	public void performFly() {
		fly.fly();
	}
	
	@Override
	public void performCry() {
		cry.cry();
	}
	
	@Override 
	public void display() {
		System.out.println("거북이의 모습");
	}
}
