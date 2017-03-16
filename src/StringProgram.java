import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class StringProgram {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/script.txt");
		Scanner fscan = new Scanner(fis);
		Scanner scan = new Scanner(System.in);
		String query = "truck";
		
		System.out.print("°Ë»ö¾î : ");
		query = scan.nextLine();
		//query.replace(target, replacement)
		String line;
		while(fscan.hasNext()){
			line = fscan.nextLine();
			
			if(line.indexOf(query) > 0 )
				System.out.println(line.replace(query, "["+query+"]"));
		}
		
		fscan.close();
		fis.close();
		
	}

}







