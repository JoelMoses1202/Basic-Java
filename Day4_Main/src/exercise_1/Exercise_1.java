package exercise_1;

public class Exercise_1 {

	public static void main(String[] args) {
		
		Factory factory=new Factory();
		SS bat=factory.make("bat");
		bat.ssBranding();

	}

}
