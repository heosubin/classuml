package kr.ac.daelim.uml;

public class Medic extends Unit{

	public void move() {
		System.out.println("메딕이 움직인다.");
	}
	
	public void underAttack() {
		System.out.println("메딕이 공격받고 있습니다.");
	}

	public void healing (Character charactor) {
		System.out.println("메딕이 회복해 줍니다.");
	}
}
