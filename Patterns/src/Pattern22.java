import java.util.Scanner;
public class Pattern22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++){
				System.out.print(" ");
			}
			for(int j= 1;j<=2*i-1;j++) {
				if(i%2==1)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
}
