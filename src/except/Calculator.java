package except;

public class Calculator {
	public static int add(int x, int y) throws �����Ѵ¿���{
		
		int result = x + y;
		
		// ���� ��Ȳ 1 : ����� ���� ����� 100�� �Ѿ�� �ȵȴ�.
		if(result > 100)
			//���� ���� �߻�->���� ��ġ�ؾ��ϳ�?(X)
			throw new �����Ѵ¿���();
		
		return result;
	}
	
	public static int sub(int x, int y){
		
		int result = x - y;
		
		return result;
	}	
}
