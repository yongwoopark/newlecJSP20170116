package oop.inherit.ui;

import java.util.ArrayList;
import java.util.Scanner;

import oop.inherit.entity.Exam;

public class ExamConsole { // ���������Ʈ��?
	
	private Exam exam;
	private ArrayList<Exam> exams;
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public ExamConsole(Exam exam) {
		this.exam = exam;
		/*exam = new Exam();*/
		this.exams = new ArrayList<>();
	}
	
	public void print() {
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		
		int total = exam.total();
		float avg = exam.avg();
		
		System.out.printf("  ����:%d\n", kor);
		System.out.printf("  ����:%d\n", eng);
		System.out.printf("  ����:%d\n", math);
		System.out.printf("  ����:%d\n", total);
		System.out.printf("  ���:%f.2\n", avg);				
		System.out.println("������������������������������������������������������");
		
	}

	public void input() {
		
		int kor, eng, math;
		
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
		
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
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
