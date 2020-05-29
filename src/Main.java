import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Zadejte rozsah cisel, pro rozsah pouzivejte pomlcku a pro oddelovani jednotlivych rozsahu carku.");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		String s = Expand.expand(str);
		System.out.println(s);

		sc.close();
	}

}
