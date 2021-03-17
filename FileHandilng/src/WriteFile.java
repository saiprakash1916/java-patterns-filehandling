import java.io.*;
public class WriteFile {
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			fout=new FileOutputStream("D://files//mytext.txt");
			String str = "Hello world...";
			byte b[]=str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Successfully Written");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}catch (IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("World soo big...");
	}
}
