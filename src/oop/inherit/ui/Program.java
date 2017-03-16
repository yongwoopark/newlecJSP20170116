package oop.inherit.ui;

import oop.inherit.entity.Exam;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new Exam(); // 종속객체:부품:Dependency
		ExamConsole console = new ExamConsole(exam); // 주입:조립:Injection
		//console.setExam(exam);
		
		console.input();
		console.print();
		
		//1. Composition(일체형) Has a Inheritance.
		//2. Association(조립형) Has a Inheritance.
		//3. Aggregation(집합형) Has a Inheritance.
		

	}

}
