package Question1;
import java.util.function.Consumer;

public class FuncInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Integer> show = z -> System.out.println(z);
		show.accept(100);

	}

}
