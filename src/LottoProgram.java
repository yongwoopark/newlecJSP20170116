import java.io.IOException;
import java.util.Random;

public class LottoProgram {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis = new FileInputStream("res/lotto.khw");
		//Scanner scan = new Scanner(fis);
		
		Random rand = new Random();
		int num;
		
		// ���� �迭 ����/����
		int []nums = new int[6];
				
		// ���� �迭�� �ζ� ��ȣ�� �ε�
		//while(scan.hasNext()){
		for(int i=0; i<6; i++){
			nums[i]=rand.nextInt(45)+1;
			//nums[i] = scan.nextInt();
			
			//System.out.printf("num : %d\n", nums[i]);
		}
		
		//scan.close();
		//fis.close();
		
		// ���
		//30 20 34 10 6 40
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", nums[i]);
		}
		System.out.println();
		
		// ����
		//32 6 20 12 39 26 19
		//nums[0]<-->nums[1]
		//1.
		
		//1. ���� �ɷ� : �ڿ���->��->�ڹ��ڵ� : �⺻���� ������ �ϱ�, ������ �ݺ��ؼ� �ۼ��غ�����.
		//2. ���� ��� �ɷ� : 
		//3. ���� �ذ� �ɷ� : �ڿ���� ���� ã��
		
		int temp;

		//��Ģ�� �����ϴ� ������ ��
		// ���� : ����,���,����,... 5,4,3,2,1
		// �������� : an = a1+(n-1)xd -> 5+(n-1)*-1 ->-n+6		
		for(int j=0; j<5; j++)	
			for(int i=0; i<5-j; i++)
				if(nums[i] > nums[i+1])
				{
					// �ٲٱ�
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
		
		// ���
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", nums[i]);
		}
		System.out.println();
		
		
	
		
		/*FileOutputStream fos = new FileOutputStream("D:\\2017-01-16\\workspace\\data.khw");
		PrintStream fout = new PrintStream(fos);
		
		fout.println("�ȴ��ϼ���");
		fout.write('H');
		fout.write('e');
		fout.write('l');
		fout.flush();
		fout.close();*/
		
		//System.out.println("�۾�����");

	}

}
