package factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		Factory factory=new Factory();
		SS bat=factory.make("bat");
		bat.ssBranding();

	}

}
