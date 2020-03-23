import java.util.ArrayList;

public class AyyayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		numbers.add(100);
		numbers.add(34);
		numbers.add(63);

		System.out.println(numbers.get(0));
		System.out.println("\n Iteration ");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

		numbers.remove(numbers.size() - 1);

		numbers.remove(0);
		System.out.println("\n Iteration");
		for (Integer value : numbers) {
			System.out.println(value);
		}
   
	}

}
