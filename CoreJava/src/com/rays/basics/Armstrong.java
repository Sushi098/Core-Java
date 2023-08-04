
public class Armstrong {

	public static void main(String[] args) {

		int number = 371;
		int sum = 0;
		int r;
		int n = number;

		while (n > 0) {

			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}

		if (sum == number) {
			System.out.println("Yes, Armstrong Number");
		} else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
