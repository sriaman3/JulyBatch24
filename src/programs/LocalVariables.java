package programs;

public class LocalVariables {

	public static void main(String[] args) {
		
		int a=0;
		System.out.println(a);

		LocalVariables lV = new LocalVariables();
		lV.add();
		lV.sum();
	}
	
	
	public void sum() {
		//Method body
		//Local variable for the this method sum()
		int a=10, b, c;
		
		String str = "Vipin";
		
		System.out.println(a);
	}
	
	
	public void add() {
		
		int a=20;
		
		System.out.println(a);
	}
	
	//Local variables
	public void sub(int b, int c, String str) {
		
		int a;
	}

}
