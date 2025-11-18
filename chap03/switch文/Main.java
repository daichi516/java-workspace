public class Main {
	public static void main(String[]args){
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(5) + 1;
		String s = switch (fortune) {
			case 1,2 -> "いいね";
			case 3   -> "普通です";
			default  -> "うーん";
		};
		System.out.println(s);
	}
}
			