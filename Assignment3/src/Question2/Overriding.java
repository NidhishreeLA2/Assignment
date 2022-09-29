package Question2;


class Animal{
	void smell(){
		System.out.println("Animals have good smelling sense");
	}
}

class dog extends Animal{
	void smell() {
		System.out.println("Dog has good smelling sense");
	}
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		dog d = new dog();
		Animal an = new dog();
		a.smell();
		d.smell();
		an.smell(); // smell is overridden

	}

}
