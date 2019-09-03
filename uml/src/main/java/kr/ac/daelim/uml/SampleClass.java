package kr.ac.daelim.uml;

public class SampleClass {
	
	private static SampleClass sampleClass;
	
	public static SampleClass getInstance() {
		
		if(sampleClass == null) {
			sampleClass = new SampleClass();
		}
		return sampleClass;
	}
	
	public void samplePrint() {
		System.out.println("Hello Sample");
	}
}
