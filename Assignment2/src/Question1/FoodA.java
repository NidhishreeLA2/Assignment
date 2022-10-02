package Question1;

class food1 extends Food{
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 100;
	}
}

public class FoodA{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food1 f1 = new food1();
		System.out.println(f1.taste());
		System.out.println(f1.price());
		System.out.println(f1.placeName());

}
}