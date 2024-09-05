package collectionFW;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayListConcept {

	public static void main(String[] args) {
		System.out.println("Sangeetha is working");
		ArrayListConcept al = new ArrayListConcept();
		al.concept1();

	}

	public void concept1() {
		ArrayList<Object> al = new ArrayList<>();
		System.out.println(al + "before adding the data");

		al.add(1223);
		al.add("Manoj");
		al.add(1223);
		al.add(123.12);
		
		
		
		al.remove(1);

		System.out.println(al);

		System.out.println(al.size());

		for (int i = 0; i < al.size(); i++) {

			if (al.get(i).equals(1223)) {
				System.out.println(al.indexOf(al.get(i)));
				break;
			}
		}

	}

}
