import java.util.Scanner;
public class Pattern8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<=i;j++){
					System.out.print("* ");			
			}
			System.out.println();
		}
	}
}
