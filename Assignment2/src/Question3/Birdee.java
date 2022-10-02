package Question3;

class bird{
	String sound = "birdee birdee";
}

class Duck extends bird{
	String sound = "Quack Quack";
	void birdsound() {
		System.out.println(sound);
		System.out.println(super.sound);
	}
	
}
public class Birdee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck d = new Duck();
		d.birdsound();

	}

}
