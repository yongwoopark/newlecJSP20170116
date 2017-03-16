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

		System.out.println("┌──────────────────────────┐");
		System.out.println("│        성적 출력              │");
		System.out.println("└──────────────────────────┘");
		
		for(int i=0; i<3; i++)
		{
			System.out.printf("  국어:%d\n", kor);
			System.out.printf("  영어:%d\n", eng);
			System.out.printf("  수학:%d\n", math);
			System.out.printf("  총점:%d\n", total);
			System.out.printf("  평균:%f.2\n", avg);				
			System.out.println("───────────────────────────");
		}
	}

	public static void input(Exam exam) {
		
		int kor;
		int eng;
		int math;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────────────┐");
		System.out.println("│        성적 입력              │");
		System.out.println("└──────────────────────────┘");
		
		do{
			System.out.print(" 국어 : ");
			kor = scan.nextInt();
			
			if(0>kor || kor>100)
				System.out.println("성적의 입력 범위는 0~100까지입니다.");
		}while(0>kor || kor>100);

		
		
		System.out.print(" 영어 : ");
		eng = scan.nextInt();
		System.out.print(" 수학 : ");
		math = scan.nextInt();
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		
	}	
	
	private static int inputMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌────────────────────┐");
		System.out.println("│       메인 메뉴               │");
		System.out.println("└────────────────────┘");
		System.out.print("  1. 성적 입력\n");
		System.out.print("  2. 성적 출력\n");
		System.out.print("  3. 프로그램 종료\n");
		System.out.print("  선택 > ");
		int menu = scan.nextInt();		
		
		return menu;
	}
}
