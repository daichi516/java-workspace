public class Main {
	public static void main(String[]args) {
		for (int i = 1; i < 10; i++) {
			if (i == 3) continue;
			for (int j = 1; j < 10; j++) {
				System.out.printf("%2d ", i * j);
			}
			System.out.println("");
		}
	}
}
				