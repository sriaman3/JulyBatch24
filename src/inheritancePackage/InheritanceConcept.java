package inheritancePackage;

public class InheritanceConcept {

	
	public static void main(String[] args) {
		
		
		Vehicle vch = new Vehicle();
		vch.engine();
		
		
		Car car = new Car();
		car.engine();
		
		//Top casting
		
		Vehicle vch1 = new Car(); //valid object creation
		vch1.engine();
		
		double i =10;
		
		int d = (int)i;
		
		System.out.println(d);
		
		
		//Down Casting
		Car car1 = (Car)new Vehicle(); //No compilation error
		car1.start(); //class cast exception,  run time error
		
		

	}

}
