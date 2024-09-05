package program1;

import prog.ProgClass1;
import programs.PrintUserName;

public class Second {

	
	
	public static void main(String[] args) {
		
		PrintUserName uN = new PrintUserName();
		
		uN.meth1();
		uN.meth2();
		uN.meth1();
		
		
		ProgClass1 pC = null;
		
		pC = new ProgClass1();
		
		pC.add();
		pC.div();
		
		new ProgClass1().add();
	}

}
