package exercise_1;

import java.util.Scanner;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STUDENT NAME");
		String name=sc.next();
		System.out.println("ENTER STUDENT ROLLNO");
		int rollNo=sc.nextInt();
		System.out.println("ENTER SCIENCE MARK");
		int sciMark=sc.nextInt();
		System.out.println("ENTER MATH MARK");
	    int mathMark=sc.nextInt();
		System.out.println("ENTER ENGLISH MARK");
	    int engMark=sc.nextInt();
	    sc.close();
		Result studentObj=new Result(name,rollNo,sciMark,mathMark,engMark);
		studentObj.markTotalling();
	}

}


