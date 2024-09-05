package programs;

public class ConditionalStatement {
	
	//ctrl+shift+F - align the code
	
	
	public void concept5(String browser) {

		//int age = 17;//hard coded

		if (browser.equals("CHROME")) {

			System.out.println("Chrome browser is opened");

		} else if(browser.equalsIgnoreCase("Edge")) {

			System.out.println("Edge browser is opened");

		}else if(browser.equalsIgnoreCase("Firefox")) {

			System.out.println("Firefox browser is opened");

		}else {
			System.out.println("Wrong browser name is passed =" + browser);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void concept3(int age) {

		//int age = 17;//hard coded

		if (age>=18) {

			System.out.println("Your are eligble for voting");

		} else {

			System.out.println("Your are not eligble for voting");

		}
	}

	// = -> assigning some value to any variable
	// == -> A == A (to check the equality), equals or equalsignore
	
	public void concept4(char c) {

		//int age = 17;//hard coded

		if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {

			System.out.println("Vowels");

		} else {

			System.out.println("Consonants");

		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Dead Code
	public void concept1() {

		if (false) {

			System.out.println("true statement");

		} else {

			System.out.println("false statement");

		}
	}

	public void concept2() {

		boolean bool = false;

		if (bool) {

			System.out.println("true statement");

		} else {

			System.out.println("false statement");

		}
	}

}
