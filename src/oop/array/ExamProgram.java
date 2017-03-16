package oop.array;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
						
		Exam[] exams = new Exam[3];		
		int index = 0;	
		int capacity = 3;
				
		int menu;
		
		while(true){		
			menu = Exam.inputMenu();
			
			switch(menu)
			{
			case 1:
				
				Scanner scan = new Scanner(System.in);
				String isContinue = "no"; 
				
				System.out.println("┌──────────────────────────┐");
				System.out.println("│        성적 입력              │");
				System.out.println("└──────────────────────────┘");
								
				
				do{
					
					if(index >= capacity) // 배열 공간이 부족하다면
					{
						//1. 임시배열 temp를 생성한다.
						Exam[] temp = new Exam[capacity+5];
						
						//2. 기존 Exam 객체들을 temp 방으로 이전한다.
						for(int i=0; i<index; i++)
							temp[i] = exams[i];
												
						//3. 창고의 크기를 새로 지정
						capacity += 5;
						
						//4. exams 가 참조하는 배열을 temp 의 배열로 변경
						exams = temp;
						
					}
					
					exams[index] = new Exam();
					exams[index].input();
					
					index++;
					
					System.out.print("continue (yes or no):");
					isContinue = scan.nextLine();
						
				}while(!isContinue.equals("no"));
				
				break;
			case 2:			
				System.out.println("┌──────────────────────────┐");
				System.out.println("│        성적 출력              │");
				System.out.println("└──────────────────────────┘");
					
				for(int i=0; i<index; i++)
					exams[i].print();
				break;
			case 3:
				break;
			}		
		}		
	}	

}
