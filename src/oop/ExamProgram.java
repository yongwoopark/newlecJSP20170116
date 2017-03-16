package oop;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		Exam exam = new Exam();
		
		int menu;
		
		while(true){		
			menu = inputMenu();
			
			switch(menu)
			{
			case 1:
				input(exam);
				break;
			case 2:
				print(exam);
				break;
			case 3:
				break;
			}		
		}		
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