package oop.omokgame;

public class Board {
	
	private char[][] buf;
	
	public Board() {
		buf = new char[15][20];
		
		for(int y=0; y<15; y++)
			for(int x=0; x<20; x++)
				buf[y][x] = '��';
	}

	public void print() {
		for(int y=0; y<15; y++){
			for(int x=0; x<20; x++)
				System.out.printf("%c", buf[y][x]); //(0,0),(1,0),(2,0) -> index=?			
			System.out.println();
		}
	}

	public void put(Omok omok) {
		int x = omok.getX();
		int y = omok.getY();
		
		buf[y][x] = '��';		
	}

}
