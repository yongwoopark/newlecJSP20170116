import java.util.Random;

public class �ڸ���ġver3 {
	public static void main(String[] args) {
		int x=0,sw=0,tt=0;
		int batch[] = new int[100];
		String namee[] = { "ä����", "������", "������", "������", "������", "�ڼ���", "���", "��ȫ��", "�̽���", "������", "��â��", "�̼���", "������",
				"�ּ�ȯ", "������", "�����", "�輱��", "�ڱ���", "�迵��","������" };
		
		Random rand = new Random();
		do {
			int p = rand.nextInt(namee.length);
			for(int i=0;i<x;i++) {
				if (p == batch[i]) {sw = 1;} 
			}
			if (sw !=1) {
				batch[x] = p;
				x++;
			}
			sw=0;
		} while(x!=namee.length);
		
		for (int i=0;i<namee.length;i++) {
			if (i%4 == 0) {tt++; System.out.print(tt+"�� : ");}; 
			System.out.print(namee[batch[i]]+ "  ");
			if (i%4 == 3) System.out.println("");
		}
	}

}
