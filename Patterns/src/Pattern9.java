import java.util.Scanner;
public class Pattern9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		for(int i=0;i<n;i++) {
			int rs = 1;
			for(int j=0;j<=i;j++){
				System.out.print(rs+" ");
				rs++;
			}

			System.out.println();
		}
	}
}
