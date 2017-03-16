package capsule;

public class Program {

	public static void main(String[] args) {
		Exam exam = new Exam();
		
		//exam.kor = 20;
		Exam.setKor(exam, 20);
		
		Exam.print(exam);
	}

}
