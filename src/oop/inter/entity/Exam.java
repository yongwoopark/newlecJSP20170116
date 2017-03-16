package oop.inter.entity;

public abstract class Exam { // ���������Ʈ��?
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
			
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int total() {		
		return kor+eng+math;
	}

	public abstract float avg();

}
























