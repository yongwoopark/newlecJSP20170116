package oop.nested;

public class AA {
	
	public static int a1;
	public int a2;
	
	static{
		a1 = 10;
	}
	
	public AA() {
		a1 =3 ;
	}
	
	public void f2(){
		a1 = 4;		
	}
	
	public static void f3(){
		a1 += 5;
		
		
	}
		
	class BB{
		
		private int a1 = 5;
		
		public void f1(){
			int a1 = 7;
			
			System.out.printf("a1 : %d\n", AA.this.a1);
		}		
	}	
	
	
	
	
	
	
	
}
