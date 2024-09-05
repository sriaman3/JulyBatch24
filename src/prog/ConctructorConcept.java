package prog;

public class ConctructorConcept {
	
	int age=0;
	

	public  ConctructorConcept() {

		// default constructor
		
		System.out.println("am default");
	}

	public ConctructorConcept(int age) {

		// Parametrized constructor
		
		System.out.println(age);
		
		this.age = age;
	}
	
	public void meth() {
		System.out.println(age);
	}

}
