public class Main2 {
    public static void main(String[]args) {
        System.out.print("［メニュー］1:検索2:登録3:削除4:変更＞");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int selected = sc.nextInt();

        switch(selected) {
            case 1 -> System.out.print("検索します");
            case 2 -> System.out.print("登録します");
            case 3 -> System.out.print("削除します");
            case 4 -> System.out.print("変更します");
            default -> System.out.print("不正な入力です");
        }
    }
}
