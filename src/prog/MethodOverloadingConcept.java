package prog;

public class MethodOverloadingConcept {

	/**
	 * add(1,2){ return a+b; }
	 * 
	 * add(1,2,3){ return a+b+c; }
	 * 
	 * add(int a,2,3,4){
	 * 
	 * return a+b+c+d; }
	 * 
	 */

	public int add(int a, int b) {
		
		return a+b;
	}

	public float add(float a, int b) {

		return a+b;
	}
	
	public int add(int a, int b, int c) {
		
		return a+b+c;
	}
}
