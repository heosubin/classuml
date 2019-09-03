package kr.ac.daelim.uml.strategy;

public abstract class Animal {
	Fly fly;
	Cry cry;
	
	public Animal() {
		
	}
	
	public void display() {
		
	}
	
	public void move() {
		
	}
	
	public void performFly() {
		fly.fly();
	}
	
	public void performCry() {
		cry.cry();
	}
}
