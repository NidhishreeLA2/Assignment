package Question1;

// Functional Interface has only one abstract method
interface FuncInterface {
	
	int twice(int a);

}

class Test{
	public static void main(String args[]) {
		int z = 5;
		
		FuncInterface f = (int a) -> a*a;
		
		int ans = f.twice(z);
		System.out.println(ans);
				
	}
	
}

	