package programs;

public class SwitchStatement {
	
	public void concept1(String browser) {
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.out.println("Chrome");
			break;
		case "firefox":
			System.out.println("firefox");
			break;
		case "edge":
			System.out.println("edge");
			break;
		case "safari":
			System.out.println("safari");
			break;

		default:
			System.out.println("Wrong browser name is passed =" + browser);
			break;
		}
	}

}
