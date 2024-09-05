package prog;

public class Revision {

	public static void main(String[] args) {
		
		
		int age = 30;
		
		String name = "Amit";
		
		char ch = 'A';
		
		boolean bool = true;
		
		double flot = 12.35;
		
		
		Revision rev = new Revision();
		String str = rev.meth1("Learning Java");
		System.out.println(str);
	}
	
	
	public String meth1(String str) {
		
		return str;
		
	}
	
	

}
