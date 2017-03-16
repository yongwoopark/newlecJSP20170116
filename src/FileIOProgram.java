import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileIOProgram {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/data.khw");
		Scanner scan = new Scanner(fis);
		int num;
						
		while(scan.hasNext()){
			num = scan.nextInt();
			System.out.printf("num : %d\n", num);
		}
		
		scan.close();
		fis.close();
		
		/*FileOutputStream fos = new FileOutputStream("D:\\2017-01-16\\workspace\\data.khw");
		PrintStream fout = new PrintStream(fos);
		
		fout.println("안뇽하세요");
		fout.write('H');
		fout.write('e');
		fout.write('l');
		fout.flush();
		fout.close();*/
		
		System.out.println("작업종료");

	}

}
