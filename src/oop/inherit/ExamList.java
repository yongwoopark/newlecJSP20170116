package oop.inherit;

public class ExamList {
	private Exam[] exams;
	private int index;
	private int capacity;
	
	public ExamList() {
		exams = new Exam[3];
		index = 0;
		capacity = 3;
	}

	public void add(Exam exam) {
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
		
		exams[index] = exam;
		
		index++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Exam get(int i) {
		// TODO Auto-generated method stub
		return exams[i];
	}
}
