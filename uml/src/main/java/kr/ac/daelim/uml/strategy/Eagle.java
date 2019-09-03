package kr.ac.daelim.uml.strategy;

public class Eagle extends Animal{
	
	public Eagle() {
		cry = new BirdCry();
		fly = new FlyWithWings();
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
		System.out.println("독수리의 모습");
	}
	
}
