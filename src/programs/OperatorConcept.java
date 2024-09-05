package programs;

public class OperatorConcept {

	/**
	 * pre-increment(++i) & post-increment (i++) -> whatever the value you have that
	 * value will get incremented either by 1
	 * 
	 * int i=10; i++; Syso(i); i=11
	 * 
	 * int i=10; ++i; i=11
	 * 
	 * pre-decrement & post-decrement (i--)
	 */
	public void concept4() {

		int x = 5;

		System.out.println(x++); // x=5
		System.out.println(++x); // x=6 7

	}

	void program1() {
		int i = 11;

		i = i++ + ++i; // 11 + 13
		System.out.println(i);// 24
	}

	void program2() {

		int a = 11, b = 22, c;

		c = a + b + a++ + b++ + ++a + ++b; // 11 + 22 + 11 + 22 + 13 + 24

		System.out.println("a=" + a);//
		System.out.println("b=" + b);//
		System.out.println("c=" + c);//
	}

	void program3() {

		int i = 0; // i=0, 1,  0, 1

		i = i++ - --i + ++i - i--;  //0 - 0 + 1 - 1

		System.out.println(i);
	}
	
	
	void program7() {
		int i=19, j=29, k = 0; //18, 28, -1
		
		int m = i-- - j-- - k--; // 19 - 29 - 0
		
		System.out.println("i="+i);//18

		System.out.println("j="+j);//28

		System.out.println("k="+k);//-1
		
		System.out.println("m=" + m);//-10
	}
	
	void program9() {
		
		int m = 0, n = 0; //-2+1

		int p = --m * --n * n-- * ++n; //-1 * -1 * -1 * -1

		System.out.println(p); //
	}

	

	public void ternaryOperator() {
		
		// ?:  -> ternary Operator
		
		int a=3, b=5;
		
		int c = a<b  ?  1 :  2;
		
		System.out.println(c);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void concept3() {

		int marks = 55;

		if (marks >= 70 && marks <= 80) {
			System.out.println("A grade");
		} else if (marks >= 50 && marks <= 60) {
			System.out.println("B grade" + marks + "am better than c grade students");
		}

		System.out.println(67 + 87 + "xyz" + 67 + 87);

	}

	public void concept1() {

		System.out.println(10 / 5);// 2

		System.out.println(9 / 5);// 1

		System.out.println(10 % 5);// 0

		System.out.println(9 % 5);// 4

	}

	public void concept2() {

		boolean bool = false;

		if (!bool) {
			System.out.println("am true");
		} else {
			System.out.println("am false");
		}

	}

}
