import java.io.*;
public class ReadFile {
	public static void main(String[] args) {
		FileInputStream fin =null;
		try {
			fin=new FileInputStream("D://files//mytext.txt");
			int in=fin.read();
			while(in != -1) {
				System.out.print((char)in);
				in=fin.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			}catch(IOException e){
				System.out.println(e);
			}
		}
	}
}
