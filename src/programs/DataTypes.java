package programs;

public class DataTypes {

	int i=0;// i is a variable, by using the data type
	
	short b = 20;
	
	double d = 90;
	
	// double is a data type
	// d is a variable
	//=  is an assignment operator
	// 90  is a value i.e. assigned to variable d

	public static void main(String[] args) {

		DataTypes dT = new DataTypes();
		dT.add();
	}

	public void add() {
		i=20;
		System.out.println(i+b);
		
	}

	public void sub() {

		System.out.println(d);
	}

	public void div() {

		System.out.println(i);
	}

}
