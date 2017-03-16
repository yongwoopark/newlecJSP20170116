import java.io.IOException;
import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis = new FileInputStream("res/lotto.khw");
		//Scanner scan = new Scanner(fis);
		
		Random rand = new Random();
		int num;
		
		// 정수 배열 선언/생성
		int []nums = new int[6];
				
		// 정수 배열에 로또 번호를 로드
		//while(scan.hasNext()){
		for(int i=0; i<6; i++){
			nums[i]=rand.nextInt(45)+1;
			//nums[i] = scan.nextInt();
			
			//System.out.printf("num : %d\n", nums[i]);
		}
		
		//scan.close();
		//fis.close();
		
		// 출력
		//30 20 34 10 6 40
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", nums[i]);
		}
		System.out.println();
		
		// 정렬
		//32 6 20 12 39 26 19
		//nums[0]<-->nums[1]
		//1.
		
		//1. 구현 능력 : 자연어->답->자바코드 : 기본적인 구문을 암기, 패턴을 반복해서 작성해봐야함.
		//2. 에러 잡는 능력 : 
		//3. 문제 해결 능력 : 자연어로 답을 찾기
		
		int temp;

		//규칙이 존재하는 숫자의 열
		// 수열 : 등차,등비,계차,... 5,4,3,2,1
		// 등차수열 : an = a1+(n-1)xd -> 5+(n-1)*-1 ->-n+6		
		for(int j=0; j<5; j++)	
			for(int i=0; i<5-j; i++)
				if(nums[i] > nums[i+1])
				{
					// 바꾸기
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
		
		// 출력
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", nums[i]);
		}
		System.out.println();
		
		
	
		
		/*FileOutputStream fos = new FileOutputStream("D:\\2017-01-16\\workspace\\data.khw");
		PrintStream fout = new PrintStream(fos);
		
		fout.println("안뇽하세요");
		fout.write('H');
		fout.write('e');
		fout.write('l');
		fout.flush();
		fout.close();*/
		
		//System.out.println("작업종료");

	}

}
