package oop.omokgame;

public class Program {

	public static void main(String[] args) {
		// ��ü�� �غ��ϱ�
		Board board = new Board();
		Omok omok = new Omok();
		
		board.print();
		
		omok.input();
		
		board.put(omok);
		
		board.print();
		
		
		
	}
}
