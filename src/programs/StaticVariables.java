package programs;

public class StaticVariables {
	
	static int a; //global variable -  not depenedent on object of the class
	
	int b; //instance variable is dependent on object of the class

	public static void main(String[] args) {
		
		System.out.println(a);
		
		StaticVariables sv = new StaticVariables();
		
		System.out.println(sv.b);

		StaticVariables.sum();
		
		sv.sum1();
		
		
	}
	
	
	
	public static void sum() {
		
		System.out.println("Ivan");
	}
	
public  void sum1() {
		
		System.out.println("Ivan");
	}
	
	
	
	
	

}
