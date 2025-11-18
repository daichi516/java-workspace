public class Main {
	public static void main(string[] args) {
		int isHungry = new java.util.Random().nextInt(2);
			String food = "からあげ";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("おなかがいっぱいです");
		} else {
			System.out.println("腹ペコです");
			System.out.println(food + "をいただきます");
		}
	}
}