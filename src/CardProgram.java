import java.util.Random;

public class CardProgram {

	public static void main(String[] args) {
		int[] cards = new int[52];
		
		for(int i=0; i<52; i++)
			cards[i] = i+1;
		
		for(int i=0; i<52; i++)
			System.out.printf("%3d", cards[i]);
		System.out.println();
				
		Random rand = new Random();
		
		for(int i=0; i<100; i++) {
			int left = rand.nextInt(52); // ·£´ý°ª
			int right = rand.nextInt(52); // ·£´ý¹å
			
			int temp = cards[left];
			cards[left] = cards[right];
			cards[right] = temp;
		}
		
		for(int i=0; i<52; i++)
			System.out.printf("%3d", cards[i]);
		System.out.println();
	}

}
