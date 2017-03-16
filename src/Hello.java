import java.util.Scanner;

class Hello {
	public static void main(String[] args) {

		// 기본값
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		int go = 0;
		int menu = 0;
		
		// 입력 도구 준비
		Scanner scan = new Scanner(System.in);		
		
		최성환:while(true){
			
			System.out.println("┌────────────────────┐");
			System.out.println("│       메인 메뉴               │");
			System.out.println("└────────────────────┘");
			System.out.print("  1. 성적 입력\n");
			System.out.print("  2. 성적 출력\n");
			System.out.print("  3. 프로그램 종료\n");
			System.out.print("  선택 > ");
			menu = scan.nextInt();
			
			switch(menu){
			case 1:
			{
				System.out.println("┌──────────────────────────┐");
				System.out.println("│        성적 입력              │");
				System.out.println("└──────────────────────────┘");
				
				do{
					System.out.print(" 국어 : ");
					kor = scan.nextInt();
					
					if(0<kor || kor>100)
						System.out.println("성적의 입력 범위는 0~100까지입니다.");
				}while(0<kor || kor>100);

				
				
				System.out.print(" 영어 : ");
				eng = scan.nextInt();
				System.out.print(" 수학 : ");
				math = scan.nextInt();
			}	
			break;
			case 2:
			{
				int total = kor + eng + math;
				float avg = total / 3;
		
				System.out.println("┌──────────────────────────┐");
				System.out.println("│        성적 출력              │");
				System.out.println("└──────────────────────────┘");
				
				for(int i=0; i<3; i++)
				{
					System.out.printf("  국어:%d\n", kor);
					System.out.printf("  영어:%d\n", eng);
					System.out.printf("  수학:%d\n", math);
					System.out.printf("  총점:%d\n", total);
					System.out.printf("  평균:%f.2\n", avg);				
					System.out.println("───────────────────────────");
				}
			}
			break;
			case 3:
			{
				System.out.println("bye~");
				break 최성환;
			}	
			
			default:
				System.out.println("메뉴의 입력 범위는 1~3까지입니다.");
			}
			
		}
	}
}



