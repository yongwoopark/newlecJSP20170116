package oop.inter.ui;

import java.util.Scanner;

import oop.inter.entity.Exam;

public class ExamConsole { // ���������Ʈ��?
	
	private PrintListener printListener;
	
	public void setPrintListener(PrintListener printListener) {
		this.printListener = printListener;
	}
	
	private Exam exam;
	//private ArrayList<Exam> exams;
	
	
	
	public void setExam(Exam exam) {
		this.exam = exam;
	}


	public Exam getExam() {
		return exam;
	}

	public ExamConsole(Exam exam) {
		this.exam = exam;
		/*exam = new Exam();*/
		//this.exams = new ArrayList<>();
	}
	
	public void print() {
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		
		System.out.println("��������������������������������������������");
		System.out.println("��       ���� ���               ��");
		System.out.println("��������������������������������������������");
		
		int total = exam.total();
		float avg = exam.avg();
		
		
		System.out.printf("  ����:%d\n", kor);
		System.out.printf("  ����:%d\n", eng);
		System.out.printf("  ����:%d\n", math);
		
		// �ڽ��� �߰��ϴ� ������ ����ϱ� ���� ��
		// ���⼭ ����� ���Ѵ�. : �������̽� ����
		if(printListener != null)
			printListener.onPrint(exam);
		
		System.out.printf("  ����:%d\n", total);
		System.out.printf("  ���:%f.2\n", avg);				
		System.out.println("������������������������������������������������������");
		
	}

	public void input() {
		
		int kor, eng, math;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������������������������������������������");
		System.out.println("��        ���� �Է�               ��");
		System.out.println("��������������������������������������������");
		
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
		
		// �̺κп� ���� ������ �˴ϴ�.
		
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
