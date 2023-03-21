package exercise_1;

class Student{
	String studentName="";
	int rollNo;
	
	public Student(String name,int rollNo) {
		// TODO Auto-generated constructor stub
		this.studentName=name;
		this.rollNo=rollNo;

	}
	
}

class Exam extends Student{
	
		int sciMark,mathMark,engMark;
		
		public Exam(String name,int rollNo,int sciMark, int mathMark,int engMark) {
			// TODO Auto-generated constructor stub
			super(name,rollNo);
			this.sciMark=sciMark;
			this.mathMark=mathMark;
			this.engMark=engMark;
		}

	
}

class Result extends Exam{

	Result(String name,int rollNo,int sciMark, int mathMark,int engMark){
		super(name,rollNo,sciMark,mathMark,engMark);
		
	}

	void markTotalling() {
		int totalMark=sciMark+mathMark+engMark;

		System.out.println("Student Name:"+studentName);
		System.out.println("Roll No:"+rollNo);
		System.out.println("Total Mark:"+totalMark);
		
		
	}
}