package struct;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BmpProgram {

	public static void main(String[] args) throws IOException {
		
		// 파일 헤더 로드
		FileInputStream fis = new FileInputStream("res/dream.bmp");
				
		byte[] fileHeader = new byte[14];
		fis.read(fileHeader);
		
		byte[] bmpHeader = new byte[92];
		fis.read(bmpHeader);
		
		fis.close();
		
		
		// 파일 크기		
		int fileSize =  getFileSize(fileHeader);
		
		System.out.printf("file size : %d", fileSize);
		
		// 이미지 너비 출력 ==================
		
		
		
		
		
		//int fileSize; = fsBuf;
		
		//비트연산자
		
		//      fsBuf[0] : 01101001
		//(int)fsBuf[0] : 00000000 00000000 00000000 01101001
		
		//      fsBuf[0] : 11101001
		//(int)fsBuf[0] : 11111111 111111111 11111111 01101001
		//(int)fsBuf[0] & 00000000 00000000 00000000 11111111
		//(int)fsBuf[0] & 0xff;
		
		
		//(int)fsBuf[0] << 24 : 01101001 00000000 00000000 00000000
		//(int)fsBuf[1] : 00000000 00111011 00000000 00000000  
				
		/*int fileSize =  (((int)fileHeader[5]) & 0xff) << 24 	|
							(((int)fileHeader[4]) & 0xff) << 16 	|
							(((int)fileHeader[3]) & 0xff) << 8  	|
							(((int)fileHeader[2]) & 0xff);*/
		
		
	}

	public static int getFileSize(byte[] fileHeader) {
		
		int fileSize =  ((int)fileHeader[5]) << 24 	& 0xff000000		|
				((int)fileHeader[4]) << 16 	& 0x00ff0000 	|
				((int)fileHeader[3]) << 8 		& 0x0000ff00  	|
				((int)fileHeader[2]) 			& 0x000000ff;
		
		return fileSize;
	}

}
