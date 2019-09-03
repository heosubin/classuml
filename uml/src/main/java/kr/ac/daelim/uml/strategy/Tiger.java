package kr.ac.daelim.uml.strategy;

public class Tiger extends Animal{
	
	Fly fly;
	Cry cry;
	
	
	public Tiger() {
		cry = new TigerCry();
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
		System.out.println("호랑이의 모습");
	}
	
}
