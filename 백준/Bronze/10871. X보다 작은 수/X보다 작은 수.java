import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				String[] con = sc.nextLine().split(" ");
				String[] arr = sc.nextLine().split(" ");
				
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < arr.length; i++) {
					if(Integer.parseInt(arr[i]) < Integer.parseInt(con[1])) {
						sb.append(String.valueOf(arr[i])+" ");
					}
				}
				System.out.println(sb);
				
	}
}