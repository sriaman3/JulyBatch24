package programs;

public class BreakAndContinue {

	public void concept() {
		/**
		 * i=0, 0<3
		 * 
		 * j=0, 0<3, j=1 1<3, 2, 2<3,  j=3 3<3
		 * 
		 * 0==0 (skip), 0==1
		 * 0 1,0 2
		 * 
		 * 
		 * 
		 * i=1, 1<3
		 * 
		 * j=0, 0<3, j=1 1<3, 2 2<3
		 * 
		 * 1==0, 1==1, 1==2
		 * 
		 * 1 0, 1 2, 
		 * 
		 * i=2, 1<3
		 * 
		 */
		for(int i = 0; i < 3; i++){
			
			for(int j = 0; j < 3; j++){
				if(i == j) {
					continue;	
				}
				System.out.print(i + " " + j + ", ");
			}
		}


	}

	public void prog1() {
		/**
		 * a=0, b=3
		 * 
		 * 0<3 && 3>0
		 * 
		 * 0 3 ,
		 * 
		 * a=1, b=2
		 * 
		 * 1<3 && 2>0
		 * 
		 * 0 3, 1 2, 
		 * 
		 * a=2, b=1
		 * 
		 * 2<3 && 1>0
		 * 
		 * 0 3, 1 2, 2,1,
		 * 
		 * a=3, b=0
		 * 
		 * 3<3 && 0>0
		 */
		
		for(int a = 0, b = 3; a < 3 && b > 0; a++, b--){
			System.out.print(a + " " + b + ", ");
		}


	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void concept1() {
		int i = 0;
		if (i == 5) {
			// continue;
		}

	}

	public void concept2() {

		for (int i = 1; i <= 10; i++) {

			if (i == 5) {// 1==5, 2==5, 3==5, 4==5, 5==5
				break;
			}

			System.out.println("learning break statement");
		}
	}

}
