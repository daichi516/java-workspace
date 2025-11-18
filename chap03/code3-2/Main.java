public class Main {
	public static void main (String[]args){
		boolean doorClose = true;
		while(doorClose == true) {
			System.out.println("ノックする");
			System.out.println("一分待つ");
			String msg = new java.util.Scanner(System.in).nextLine();
			if(msg.equals("y")) {
				doorClose = false;
			}
		}
		System.out.println("トイレに入る");
	}
}