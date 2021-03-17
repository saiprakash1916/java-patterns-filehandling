import java.util.Scanner;
public class Pattern17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--){
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
