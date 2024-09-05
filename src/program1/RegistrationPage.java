package program1;

public class RegistrationPage {

	public static void main(String[] args) {
		
		int aman_age = 30;
		
		String aman_name = "Aman Srivastava"; //Non - primitive
		
		float decimalNum = 30.90F;
		
		double decimalNumb = 30.90;
		
		char ch = 'A'; //internally using integer
		
		System.out.println('A');
		
		byte b = 110;
		
		long x = 110L;
		
		RegistrationPage reg = new RegistrationPage();
		reg.concept6();

	}
	
	
	public void concept6() {
		
		char ch = 'a';
		
		System.out.println((int)ch);//ASCII number of A
	}
	
	public void concept5() {
		//top casting & Down Casting
		
		double i =10;
		
		System.out.println(i);
		
		int d = (int)i; //down casting
		
		System.out.println(d);
	}
	
	public void concept4() {
		//top casting & Down Casting
		
		int i =10;
		
		double d = i; //top casting
		
		System.out.println(d);
	}
	
	public void doRegistration() {
		System.out.println(1.0f / 0.0f);//Infinity
		System.out.println(-1.0f / 0.0f);//-Infinity
		System.out.println(0.0f / 0.0f);//NaN
		System.out.println(10.0 / 0); //Infinity
		System.out.println(10 / 0); //Airthmetic Exception

	}

}
