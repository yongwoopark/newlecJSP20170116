package oop;
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
		
	}

	public static int getFileSize(byte[] fileHeader) {
		
		int fileSize =  ((int)fileHeader[5]) << 24 	& 0xff000000		|
				((int)fileHeader[4]) << 16 	& 0x00ff0000 	|
				((int)fileHeader[3]) << 8 		& 0x0000ff00  	|
				((int)fileHeader[2]) 			& 0x000000ff;
		
		return fileSize;
	}

}
