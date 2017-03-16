package capsule;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public static void setKor(Exam exam, int kor){
		exam.kor = kor;
	}
	
	public static void print(Exam exam) {
		
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		
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

	public static void input(Exam exam) {
		
		int kor;
		int eng;
		int math;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������������������");
		System.out.println("��        ���� �Է�              ��");
		System.out.println("��������������������������������������������������������");
		
		do{
			System.out.print(" ���� : ");
			kor = scan.nextInt();
			
			if(0>kor || kor>100)
				System.out.println("������ �Է� ������ 0~100�����Դϴ�.");
		}while(0>kor || kor>100);

		
		
		System.out.print(" ���� : ");
		eng = scan.nextInt();
		System.out.print(" ���� : ");
		math = scan.nextInt();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}	
	
	private static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������");
		System.out.println("��       ���� �޴�               ��");
		System.out.println("��������������������������������������������");
		System.out.print("  1. ���� �Է�\n");
		System.out.print("  2. ���� ���\n");
		System.out.print("  3. ���α׷� ����\n");
		System.out.print("  ���� > ");
		int menu = scan.nextInt();		
		
		return menu;
	}
}
