package kr.ac.daelim.uml;

public class UnitExecutor {
	public static void main(String[] args) {
		Unit unit = new Unit();
		unit.move();
		
		Marin marin = new Marin();
		marin.move();
		marin.attack();
		
		Medic medic = new Medic();
		medic.move();
		medic.healing(null);
	}

}
