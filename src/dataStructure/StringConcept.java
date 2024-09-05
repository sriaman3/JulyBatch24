package dataStructure;

public class StringConcept {
	
	/**
	 * str---Hello = Str1
	 * 
	 * str = Hello World
	 */
	
	String str = "Hello World"; 
	
	String str1 = "Hello";
	
	
	public static void main(String[] args) {
		
		String str = "Hello World"; //indexing
		
		System.out.println(str.length());
		
		StringConcept sc = new  StringConcept();
		sc.concatConcept();
		
	}
	
	public void conceptCharAt() {

		String s= "Hello"; 
		System.out.println(s.charAt(2));
	}
	
	public void conceptIndexOf() {
		
		String s= "Java Hello";
		
		System.out.println(s.indexOf('a'));
		
		System.out.println(s.indexOf("Hello"));
		
		System.out.println(s.indexOf('a', s.indexOf('a')+1));
	}
	
	public void conceptTrim() {

		String s= "   Hello  ";
		System.out.println(s.trim());
	}
	
	public void conceptReplace() {

		String s= "   Hello Java  ";
		System.out.println(s.replace(" ", ""));
	}
	
	public void concept5() {
		String s="This is your order id 11234";
		
		System.out.println(s.length());
		System.out.println(s.substring(s.indexOf("id")+3));
		
		String st="Your order 2312 is generated successfully";

		String s1=st.substring(st.indexOf("order")+6, st.indexOf("i"));
		
		System.out.println(s1);

	}
	
	public void concept6() {
		String str = "java world";
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.toLowerCase());
	}

	
	public void concatConcept() {
		
		String str = "java";
				
		System.out.println(str.concat(" "+"World"));		
	}

}
