package oop.collection;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		//ExamList list = new ExamList();
		ObjectList list = new ObjectList();
		
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
					
					Exam exam = new Exam();
					exam.input();
					
					list.add(exam);
					
					System.out.print("continue (yes or no):");
					isContinue = scan.nextLine();
						
				}while(!isContinue.equals("no"));
				
				break;
			case 2:			
				System.out.println("��������������������������������������������������������");
				System.out.println("��        ���� ���              ��");
				System.out.println("��������������������������������������������������������");
					
				for(int i=0; i<list.size(); i++){
					Exam exam = (Exam)list.get(i);
					exam.print();
				}
				
				break;
			case 3:
				break;
			}		
		}		
	}	

}
