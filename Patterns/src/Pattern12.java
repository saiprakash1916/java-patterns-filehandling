import java.util.Scanner;
public class Pattern12 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many lines");
		int n = sc.nextInt();
		sc.close();
		int alphabet = 65;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++){
				System.out.print((char)(alphabet+j)+" ");
			}
			System.out.println();
		}
	}
}
