import java.util.Scanner;
public class Pattern13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		int K = 1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=n;j++){
				System.out.print(K % 2+" ");
				K++;
			}
			System.out.println();
		}
	}
}
