package oop.array;

import java.util.Scanner;

public class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public void setKor(int kor){
		this.kor = kor;
	}
	
	public void print() {
		
		int kor = this.kor;
		int eng = this.eng;
		int math = this.math;
		
		int total = kor + eng + math;
		float avg = total / 3;
		
		System.out.printf("  ����:%d\n", kor);
		System.out.printf("  ����:%d\n", eng);
		System.out.printf("  ����:%d\n", math);
		System.out.printf("  ����:%d\n", total);
		System.out.printf("  ���:%f.2\n", avg);				
		System.out.println("������������������������������������������������������");
		
	}

	public void input() {
				
		Scanner scan = new Scanner(System.in);
				
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
		
	}	
	
	public static int inputMenu() {
		
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
