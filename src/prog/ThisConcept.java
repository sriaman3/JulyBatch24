package prog;

public class ThisConcept {
	
	String name = "Ivan";

	public static void main(String[] args) {
		
	}
	
	
	public ThisConcept() {
		
		System.out.println("default");
	}
	
	
	public ThisConcept(String name) {
		
		this();
		System.out.println(name);
		
		
	}
	
	public void meth() {
		
		System.out.println(name);
		
		System.out.println(this.name);
		
		
	}
	

}
