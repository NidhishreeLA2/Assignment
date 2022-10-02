package Question2;

public class Exception {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			int dat = 100/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("continue the code");
		}

	}

}
