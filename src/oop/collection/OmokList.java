package oop.collection;

public class OmokList {
	private Omok[] omoks;
	private int index;
	private int capacity;
	
	public OmokList() {
		omoks = new Omok[3];
		index = 0;
		capacity = 3;	
	}

	public void add(Omok omok) {
		if(index >= capacity) // �迭 ������ �����ϴٸ�
		{
			//1. �ӽù迭 temp�� �����Ѵ�.
			Omok[] temp = new Omok[capacity+5];
			
			//2. ���� Exam ��ü���� temp ������ �����Ѵ�.
			for(int i=0; i<index; i++)
				temp[i] = omoks[i];
									
			//3. â���� ũ�⸦ ���� ����
			capacity += 5;
			
			//4. exams �� �����ϴ� �迭�� temp �� �迭�� ����
			omoks = temp;
			
		}
		
		omoks[index] = omok;
		
		index++;
	}

	public int size() {
		// TODO Auto-generated method stub
		return index;
	}

	public Omok get(int i) {
		// TODO Auto-generated method stub
		return omoks[i];
	}
}
