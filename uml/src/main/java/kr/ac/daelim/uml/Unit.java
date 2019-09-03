package kr.ac.daelim.uml;

public class Unit {
	public String name;
	public int health;
	
	public void move() {
		System.out.println("유닛이 움직인다.");
	}
	
	public void underAttack(Character charactor) {
		System.out.println("유닛이 공격받는다.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
