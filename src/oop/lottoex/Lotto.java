package oop.lottoex;

import java.util.Random;

public class Lotto {
	private int[] nums; 
	
	public Lotto(){
		nums = new int[6];
	}
	
	public void gen(){
		Random rand = new Random();
		
		for(int i=0; i<6; i++)
			nums[i]=rand.nextInt(45)+1;			
	}
	
	public void print() {
		for(int i=0; i<6; i++){
			System.out.printf("%-4d", nums[i]);
		}
		System.out.println();
	}
	
	public void sort() {
		int temp;

		for(int j=0; j<5; j++)	
			for(int i=0; i<5-j; i++)
				if(nums[i] > nums[i+1])
				{
					// ¹Ù²Ù±â
					temp = nums[i];
					nums[i] = nums[i+1];
					nums[i+1] = temp;
				}
	}
	
}
