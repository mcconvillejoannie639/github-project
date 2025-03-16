import java.util.Random;
public class MyClass {
	public static void main(String[] args) {
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = new Random().nextInt(10);
		}
		System.out.println(Arrays.toString(numbers));
	}
}
