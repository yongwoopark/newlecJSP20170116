package oop;
import java.io.IOException;
import java.util.Random;

public class LottoProgram {

	
	
	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis = new FileInputStream("res/lotto.khw");
		//Scanner scan = new Scanner(fis);
		
		Random rand = new Random();
		int num;
		
		// �ζ� ����
		int []lotto = new int[6];
		
		// �ζǹ�ȣ ���� 		
		genLotto(lotto);
				
		// �ζ� ��ȣ ���
		printLotto(lotto);
		
		// �ζ� ��ȣ ����
		sortLotto(lotto);
		
		// �ζ� ��ȣ ���
		printLotto(lotto);

	}
	
	public static void genLotto(int[] lotto){
		Random rand = new Random();
		
		for(int i=0; i<6; i++)
			lotto[i]=rand.nextInt(45)+1;
			
	}

	public static void sortLotto(int[] lotto) {
		int temp;

		for(int j=0; j<5; j++)	
			for(int i=0; i<5-j; i++)
				if(lotto[i] > lotto[i+1])
				{
					// �ٲٱ�
					temp = lotto[i];
					lotto[i] = lotto[i+1];
					lotto[i+1] = temp;
				}
	}

	public static void printLotto(int[] lotto) {
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", lotto[i]);
		}
		System.out.println();
	}

}
