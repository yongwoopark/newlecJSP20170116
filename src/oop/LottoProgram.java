package oop;
import java.io.IOException;
import java.util.Random;

public class LottoProgram {

	
	
	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis = new FileInputStream("res/lotto.khw");
		//Scanner scan = new Scanner(fis);
		
		Random rand = new Random();
		int num;
		
		// 로또 생성
		int []lotto = new int[6];
		
		// 로또번호 생성 		
		genLotto(lotto);
				
		// 로또 번호 출력
		printLotto(lotto);
		
		// 로또 번호 정렬
		sortLotto(lotto);
		
		// 로또 번호 출력
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
					// 바꾸기
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
