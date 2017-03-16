package oop;
import java.util.Scanner;

public class OmokProgram {

	public static char[][] createBoard(){
		
		char[][] board = new char[15][20];
		
		return board;
	}
	
	public static void main(String[] args) {
		
		//오목판 생성
		char[][] board = createBoard();
		
		//오목판 그리기
		drawBoard(board);
		
				
		//오목판 출력
		printBoard(board);
		
	}
	
	public static void drawBoard(char[][] board){
		
	}
	
	public static void printBoard(char[][] board){
		
	}
	
	

}
