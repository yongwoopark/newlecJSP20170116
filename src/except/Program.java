package except;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
			
		FileOutputStream fis = null;
		 try {
			
			 Calculator.add(20, 10);
			 
			fis = new FileOutputStream("aa.txt");
			fis.write(52);						
			
		} catch (FileNotFoundException e) {			
			System.out.println("죄송합니다. 입력하신 파일을 찾을 수가 없어서...");			
		} catch (Exception e) {
			System.out.println("죄송합니다. 출력에 문제가 발생햇습니다...");			
		} finally{
			// 정리작업
			System.out.println("정리합니다");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	 

}
