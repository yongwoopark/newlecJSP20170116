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
				
				System.out.println("��������������������������������������������������������");
				System.out.println("��        ���� �Է�              ��");
				System.out.println("��������������������������������������������������������");
								
				
				do{
					
					if(index >= capacity) // �迭 ������ �����ϴٸ�
					{
						//1. �ӽù迭 temp�� �����Ѵ�.
						Exam[] temp = new Exam[capacity+5];
						
						//2. ���� Exam ��ü���� temp ������ �����Ѵ�.
						for(int i=0; i<index; i++)
							temp[i] = exams[i];
												
						//3. â���� ũ�⸦ ���� ����
						capacity += 5;
						
						//4. exams �� �����ϴ� �迭�� temp �� �迭�� ����
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
				System.out.println("��������������������������������������������������������");
				System.out.println("��        ���� ���              ��");
				System.out.println("��������������������������������������������������������");
					
				for(int i=0; i<index; i++)
					exams[i].print();
				break;
			case 3:
				break;
			}		
		}		
	}	

}
