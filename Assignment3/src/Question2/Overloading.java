package Question2;

public class Overloading {
	
	static int multiply(int a,int b) {
		return a*b;
	}
	
	static int multiply(int a,int b,int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply(4,3));
		System.out.println(multiply(4,3,2));

	}

}
