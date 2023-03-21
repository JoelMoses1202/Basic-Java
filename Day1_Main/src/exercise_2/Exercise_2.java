package exercise_2;

public class Exercise_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();

	}

}


class A{
	A()
	{
		System.out.println("THIS IS CLASS A CONSTRUCTOR");
	}
	
}

class B{
	B()
	{
		System.out.println("THIS IS CLASS B CONSTRUCTOR");
	}
	
}

class C extends A{
 
		B b;
	

}