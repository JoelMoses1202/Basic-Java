package exercise_4;

class Singleton{
	private static Singleton instance = null;  
	String str= "it is an example of singleton class.";  
	private Singleton() {
	}
	public static Singleton getInstance() {  
	if (instance == null){  
    instance = new Singleton();  
	}  
	return instance; 
	}
}