package oop.collection;

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
