package programs;

public class MethodConcept {

	public static void main(String[] args) {
		
		MethodConcept meth = new MethodConcept();
		int var = meth.concept7(10,45);
		
		System.out.println(var);

	}
	
	
	/**
	 * Whatever the business logic - we have to write, always write inside the method
	 * 
	 * 
	 * public -  is an access specifier
	 * 
	 * void - no return value
	 * 
	 * concept1() -> method name
	 * 
	 * { } -> starting & ending bracket
	 */
	
	public void concept1() {
		int a =10;
		int b =20;
		
		int v = 70;
		
		System.out.println(a+b);
	}
	
	public void doLogin(String uN, String pwd) {
		
		System.out.println(uN + "am passing to my userName field");
		
		System.out.println(pwd + "am passing to my password field");
		
		System.out.println("Clicking on the login button");
	}
	
	/**
	 * retrun 30 as sum of 2 number
	 */
	
	public double concept3() {
		
		int a =50;
		int b =20;
		
		return a+b;
	}
	
	
	/**
	 * @return 
	 * 
	 * we have a return type as well as asking for arguments from the end user
	 */
	
	public int concept7(int a, int b) {
		
		return a*b;
		
	}

}
