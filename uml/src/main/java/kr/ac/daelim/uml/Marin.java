package kr.ac.daelim.uml;

public class Marin extends Unit{
	protected int attackPower;
	
	public void move() {
		System.out.println("마린이 움직인다.");
	}
	
	public void attack() {
		System.out.println("마린이 공격한다.");
	}
	
	public void underAttack(Character charactor) {
		System.out.println("마린이 공격을 받고 있습니다.");
	}
	
}
