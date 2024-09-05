package dataStructure;

import java.util.Arrays;

public class ArrayConcept {

	public static void main(String[] args) {
		
		ArrayConcept ac = new ArrayConcept();
		ac.concept6();
		
		//int i=10;

		String[] name = new String[10];
		
		name[0] = "Ivan";
		name[1] = "Sangeetha";
		name[2] = "Anoj";
		name[3] = "Dibyesh";
		name[4] = "Dibya";
		
		//System.out.println(name[4]);
		
		
		String[] val  = {"1","2","3","4"};
		
		for(int i=0;i<val.length;i++) { //i=0 0<4, val[0] = 1,  i=1, 1<4, val[1] = 2, i=2..., i=3 3<4, val[3] = 4,  i=4, 4<4
			
			//System.out.println(val[i]);
		}
		
		
		/**
		 * name = ["Ivan","Sangeetha","Barsha", "Anoj", "Dibya", "Dibyesh"];
		 * 
		 *        [0,1,2,3,4,5,6,7,8,9]
		 *        
		 *        
		 *        val = [1,2,3,4] - data //4
		 *              [0,1,2,3]- index //4-1
		 */
	}
	
	public void concept() {
		int[] arr= {1,2,4,5};
		
		int arr1[]= new int[2];
		
		System.out.println(arr.length);
		
		System.out.println(arr[4]);
	}
	
	public void concept1() {
		int[] arr= {1,2,4,5}; //4,  0
		
		System.out.println(arr.length);
		
		for(int i=0;i<=arr.length-1;i++) {
			
			System.out.println(arr[i]);
		}
	}

	public void concept5() {
		int [] arr = {1,2,15,17,3};
		
		Arrays.sort(arr);//ASC order 1 2 3 15 17
		
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.println(arr[i]);
		}
	}


	public void concept6() {
		String [] arr = {"Unassigned","Assigned","All", "All Unassigned"}; //1D
		
		for(int i=0;i<=arr.length-1;i++) {
			
			if(arr[i].equals("Assigned")) {
				System.out.println("Click on that link");
				break;
			}else {
				System.out.println("Menu is not found");
				
			}
			
		}
	}


}
