import java.util.Scanner;
public class Pattern30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++){
				System.out.print("  ");
			}
			int al=65;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print((char)(al)+" ");
				if(j<i)
					al++;
				else
					al--;
			}
			System.out.println();
		}
	}
}
