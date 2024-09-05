package programs;

public class LoopConcept {
	
	
	
	public void concept5() {
		
		int i=1;
		
		while(i<=2) {
			System.out.println("hello");
			i++;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/**
	 * loop concept - you can print same data or whatever the logic we are building
	 * 
	 * for, while
	 */
	
	public void concept1() {
		//Aman 10 times
		
		//int i=0;
		
		for(int i=0; i<=9 ; i++) {  //i=0 0<=9, 1 1<=9, 2 2<=9 3 3<=9.... 9 9<=9,  10 10<=9
			
			System.out.println("Aman");
		}
		
	}

	
	
	public void concept2(int num) {
		//1 to 10 on console

		for(int i=1; i<=10 ; i++) {  //i=0 0<=9, 1 1<=9, 2 2<=9 3 3<=9.... 9 9<=9,  10 10<=9
			
			System.out.println(i*num);
		}
	}
	
	
	public void concept3() {
		
		for(;;) {
			System.out.println("Welcome to java world");
		}
	}
	
	//Interview 
	public void concept4() {
		//ASCII a=97 to z=126
		
		for(char c='A'; c<='Z';c++) {
			System.out.println((int)c);
		}
	}
	
	
	
	
	
}
