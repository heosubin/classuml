package kr.ac.daelim.uml.strategy;

public class FlyNoWay implements Fly {
	
	public void fly() {
		System.out.println("날지 못한다.");
	}
}
