import java.util.Scanner;

public class OmokProgram {

	public static void main(String[] args) {
		
		// ������ ����
		//char[] board = new char[15*20];
		char[][] board = new char[15][20];
		
		// ������ �ʱ�ȭ
		/*for(int i=0; i<15*20; i++)
			board[i] = '��';*/
		for(int y=0; y<15; y++)
			for(int x=0; x<20; x++)
				//board[20*y+x] = '��';
				board[y][x] = '��';
		
		// ������ ���
		for(int y=0; y<15; y++){
			for(int x=0; x<20; x++)
				System.out.printf("%c", board[y][x]); //(0,0),(1,0),(2,0) -> index=?			
			System.out.println();
		}
		
		Scanner scan = new Scanner(System.in);		
		int omok_x, omok_y;		
		System.out.print("�����Է�(x sp y) : ");
		omok_x = scan.nextInt();
		omok_y = scan.nextInt();
		
		// �����ǿ� ���� �α�
		//x=5, y=12 �� ������ �νÿ�.
		//board[20*11+4] = '��';
		board[omok_y-1][omok_x-1] = '��';
		
		// ������ ���
		for(int y=0; y<15; y++){
			for(int x=0; x<20; x++)
				System.out.printf("%c", board[y][x]); //(0,0),(1,0),(2,0) -> index=?			
			System.out.println();
		}
		
		// �������� �׸��� : ���������� ������ �������.
		/**
		 * ��������������������
		 * �����ۦ�������������
		 */
		
		/*for(int y=1; y<=15; y++)
		{
			for(int x=1; x<=20; x++)
				if(x==1 && y==1)
					System.out.print("��");
				else if(y==1)
					System.out.print("��");
				else if(x==20)
					System.out.print("��");
				else if(x==1)
					System.out.print("��");
				else if(y==15)
					System.out.print("��");
				else
					System.out.print("��");
			
			System.out.println();
		}*/
		
		
		// ���� ��ǥ, ������ �Է� �ް�
		
		// ������ �ΰ�
		
		// �������� �ٽ� �׸���
		
		
	}

}
