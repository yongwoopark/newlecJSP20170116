package oop.collection;

public class ObjectList {
	private Object[] objects;
	private int index;
	private int capacity;
	
	public ObjectList() {
		objects = new Object[3];
		index = 0;
		capacity = 3;	
	}

	public void add(Object exam) {
		if(index >= capacity) // �迭 ������ �����ϴٸ�
		{
			//1. �ӽù迭 temp�� �����Ѵ�.
			Object[] temp = new Object[capacity+5];
			
			//2. ���� Exam ��ü���� temp ������ �����Ѵ�.
			for(int i=0; i<index; i++)
				temp[i] = objects[i];
									
			//3. â���� ũ�⸦ ���� ����
			capacity += 5;
			
			//4. exams �� �����ϴ� �迭�� temp �� �迭�� ����
			objects = temp;
			
		}
		
		objects[index] = exam;
		
		index++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Object get(int i) {
		// TODO Auto-generated method stub
		return objects[i];
	}
}
