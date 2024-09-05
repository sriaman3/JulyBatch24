package prog;

public class RunnerClass {

	public static void main(String[] args) {
		
		
		//ThisConcept cc = new ThisConcept();
		
		EncapsulationConcept cc1 = new EncapsulationConcept("Ivan",20,10);
		
		
		int age = cc1.getAge();
		System.out.println(age);
		System.out.println(cc1.getId());
		System.out.println(cc1.getName());
		
	}

}
