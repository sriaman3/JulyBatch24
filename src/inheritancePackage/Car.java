package inheritancePackage;

public class Car extends Vehicle {
	
	
	public Car() {
		super();
	}
	
	public void start() {
		System.out.println(super.str);
		System.out.println("car start");
	}
	
	public void stop() {
		
		super.engine();
		this.engine();
		System.out.println("car stop");
	}
	
	public void refuel() {
		System.out.println("car refuel");
	}
	
	public  void tyrePressure() {
		System.out.println("car tyre pressure");
		//super.engine();
	}
	
	@Override
	public void engine() {
		System.out.println("It is my car -- engine");
		//super.engine();
	}




}
