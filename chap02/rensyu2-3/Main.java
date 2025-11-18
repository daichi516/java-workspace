public class Main{
	public static void main(String[]args){
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in, "Shift-JIS").nextLine();
		System.out.println("あなたの年齢を入力してください");
		int age = new java.util.Scanner(System.in, "Shift-JIS").nextInt();
		int r = new java.util.Random().nextInt(4) + 1;
		System.out.println("占いの結果がでました");
		System.out.println(age + "歳の" + name +"さん、あなたの運気番号は" + r + "です");
		System.out.println("1:大吉 2:中吉 3:小吉 4:凶");
	}
}	