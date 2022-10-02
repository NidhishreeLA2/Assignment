package Question1;

class food2 extends Food{
	@Override
	String taste() {
		// TODO Auto-generated method stub
		return "spicy";
	}

	@Override
	int price() {
		// TODO Auto-generated method stub
		return 150;
	}
}

public class FoodB {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		food2 f1 = new food2();
		System.out.println(f1.taste());
		System.out.println(f1.price());
		System.out.println(f1.placeName());

	
	}
}


