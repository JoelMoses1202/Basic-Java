package exercise_4;

public class Exercise_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton a=Singleton.getInstance();
		Singleton b=Singleton.getInstance();
		Singleton c=Singleton.getInstance();
		b.str+=" --changed";   
		System.out.println(a.str);
		a.str+="--0";
		System.out.println(b.str);
		System.out.println(c.str);
		System.out.println(a.str);
	}
}

