import java.util.Scanner;

class Hello {
	public static void main(String[] args) {

		// �⺻��
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int go = 0;
		int menu = 0;
		
		// �Է� ���� �غ�
		Scanner scan = new Scanner(System.in);		
		
		�ּ�ȯ:while(true){
			
			System.out.println("��������������������������������������������");
			System.out.println("��       ���� �޴�               ��");
			System.out.println("��������������������������������������������");
			System.out.print("  1. ���� �Է�\n");
			System.out.print("  2. ���� ���\n");
			System.out.print("  3. ���α׷� ����\n");
			System.out.print("  ���� > ");
			menu = scan.nextInt();
			
			switch(menu){
			case 1:
			{
				System.out.println("��������������������������������������������������������");
				System.out.println("��        ���� �Է�              ��");
				System.out.println("��������������������������������������������������������");
				
				do{
					System.out.print(" ���� : ");
					kor = scan.nextInt();
					
					if(0<kor || kor>100)
						System.out.println("������ �Է� ������ 0~100�����Դϴ�.");
				}while(0<kor || kor>100);

				
				
				System.out.print(" ���� : ");
				eng = scan.nextInt();
				System.out.print(" ���� : ");
				math = scan.nextInt();
			}	
			break;
			case 2:
			{
				int total = kor + eng + math;
				float avg = total / 3;
		
				System.out.println("��������������������������������������������������������");
				System.out.println("��        ���� ���              ��");
				System.out.println("��������������������������������������������������������");
				
				for(int i=0; i<3; i++)
				{
					System.out.printf("  ����:%d\n", kor);
					System.out.printf("  ����:%d\n", eng);
					System.out.printf("  ����:%d\n", math);
					System.out.printf("  ����:%d\n", total);
					System.out.printf("  ���:%f.2\n", avg);				
					System.out.println("������������������������������������������������������");
				}
			}
			break;
			case 3:
			{
				System.out.println("bye~");
				break �ּ�ȯ;
			}	
			
			default:
				System.out.println("�޴��� �Է� ������ 1~3�����Դϴ�.");
			}
			
		}
	}
}



