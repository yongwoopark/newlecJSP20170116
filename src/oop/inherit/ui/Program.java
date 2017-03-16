package oop.inherit.ui;

import oop.inherit.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new Exam(); // ���Ӱ�ü:��ǰ:Dependency
		ExamConsole console = new ExamConsole(exam); // ����:����:Injection
		//console.setExam(exam);
		
		console.input();
		console.print();
		
		//1. Composition(��ü��) Has a Inheritance.
		//2. Association(������) Has a Inheritance.
		//3. Aggregation(������) Has a Inheritance.
		

	}

}
