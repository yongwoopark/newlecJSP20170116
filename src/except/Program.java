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
			System.out.println("�˼��մϴ�. �Է��Ͻ� ������ ã�� ���� ���...");			
		} catch (Exception e) {
			System.out.println("�˼��մϴ�. ��¿� ������ �߻��޽��ϴ�...");			
		} finally{
			// �����۾�
			System.out.println("�����մϴ�");
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	 

}
