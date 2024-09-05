package collectionFW;

public class ExceptinConcept {

	public static void main(String[] args) {

		try {
		System.out.println("rrtghiu");
		int i = 100/2;
		System.out.println(i);
		System.out.println("rrtghiu");
		String s =null;
		
		System.out.println(s.length()); //Exception lin no. 14 to catch block -> print the error -> print finally block
		
		System.out.println("tttttt");
		}
		catch(NullPointerException e) {
			
			System.out.println(e);
			
		}finally {
			System.out.println("will be executing my self everytime");
		}
		
		System.out.println("rrtghiu");
		

	}

}
