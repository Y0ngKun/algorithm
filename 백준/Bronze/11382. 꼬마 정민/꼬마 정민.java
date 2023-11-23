import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String a = sc.next();
				String b = sc.next();
				String c = sc.next();
				System.out.println( (Long.parseLong(a) + Long.parseLong(b) + Long.parseLong(c)));
	}
}