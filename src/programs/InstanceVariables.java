package programs;

public class InstanceVariables {

	// instance variable or class variable
	int railwayStation=200;
	String airport;

	
	public static void main(String[] args) {
		
		InstanceVariables iv = new InstanceVariables();
		iv.nehruPlace();
		iv.sadarBazar();
		iv.chadniChawk();
		
		
	}

	public void nehruPlace() {

		System.out.println(railwayStation);
	}

	public void sadarBazar() {

		System.out.println(railwayStation);
	}

	public void chadniChawk() {
		int b =500;
		System.out.println(railwayStation+b);
	}

	public void sum3() {

		System.out.println(railwayStation);
	}

}
