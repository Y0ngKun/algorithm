import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				int limit = sc.nextInt();
				sc.nextLine();
				String str = sc.nextLine();
				String[] strArr = str.split(" ");
				String target = sc.nextLine();
				
				int tmp = 0;
				for (int i = 0; i < strArr.length; i++) {
					if(strArr[i].equals(target))tmp++;
				}
				System.out.println(tmp);
	}
}