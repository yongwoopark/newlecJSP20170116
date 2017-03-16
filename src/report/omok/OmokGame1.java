package report.omok;
/* 
 * ==================================
 * Date: 2017.02.05
 * Author: Wonjun Jo
 * Object: 오목게임을 위한 기초적 code작성
 * ==================================
 */
import java.util.Scanner;

public class OmokGame1 {

	public static void main(String[] args) {

		boolean flag = true;
		int garo, sero;

		Scanner scan = new Scanner(System.in);
		char[][] board = new char[15][20];
		char[][] joongbok = new char[15][20];

		for (sero = 0; sero < 15; sero++)
			for (garo = 0; garo < 20; garo++)
				board[sero][garo] = '┼';

		for (int i = 1; i <= 18; i++) {
			board[0][i] = '┬';
			board[14][i] = '┴';
		}

		for (int i = 1; i <= 13; i++) {
			board[i][0] = '├';
			board[i][19] = '┤';
		}

		board[0][0] = '┌';
		board[0][19] = '┐';
		board[14][0] = '└';
		board[14][19] = '┘';

		while (true) {
			System.out.print("먼저 시작 할 돌을 선택하세요.\n(방법: 1. 흰돌 2.검은돌)>>> ");
			int choice = scan.nextInt();
			if (choice == 1) {
				flag = true;
				break;
			} else if (choice == 2) {
				flag = false;
				break;
			} else {
				System.out.println("다시 선택 해 주세요!");
			}
		}

		while (true) {
			for (sero = 0; sero < 15; sero++) {
				for (garo = 0; garo < 20; garo++)
					System.out.printf("%c", board[sero][garo]);
				System.out.println();
			}

			System.out.print("돌을 놓을 곳을 선택하세요.\n(방법: 가로좌표 space 세로좌표)>>> ");
			garo = scan.nextInt();
			sero = scan.nextInt();

			if (flag == true)
				if (joongbok[sero - 1][garo - 1] != '○' && joongbok[sero - 1][garo - 1] != '●') {
					board[sero - 1][garo - 1] = '○';
					joongbok[sero - 1][garo - 1] = '○';
					flag = false;
				} else {
					System.out.println("무리수, 이미 돌이 놓여있습니다.");
					flag = true;
				}

			else if (joongbok[sero - 1][garo - 1] != '○' && joongbok[sero - 1][garo - 1] != '●') {
				board[sero - 1][garo - 1] = '●';
				joongbok[sero - 1][garo - 1] = '●';
				flag = true;
			} else {
				System.out.println("무리수, 이미 돌이 놓여있습니다.");
				flag = false;
			}
		}
	}
}