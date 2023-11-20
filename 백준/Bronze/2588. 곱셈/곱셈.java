import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				int a= sc.nextInt();
				int b= sc.nextInt();
				
				int tmp = b;
				int c = a*(tmp%10);
				tmp = tmp/10;
				int d = a*(tmp%10);
				tmp = tmp/10;
				int e = a*(tmp%10);
				System.out.println(c);
				System.out.println(d);
				System.out.println(e);
				System.out.println(a*b);
				
	}
}