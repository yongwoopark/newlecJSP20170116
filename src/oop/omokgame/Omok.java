package oop.omokgame;

import java.util.Scanner;

public class Omok {

	private int x;
	private int y;
		
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void input() {		
		Scanner scan = new Scanner(System.in);		
		
		System.out.print("오목입력(x sp y) : ");
		x = scan.nextInt();
		y = scan.nextInt();		
	}
}
