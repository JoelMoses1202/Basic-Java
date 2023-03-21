package exercise_6;


interface Stack{
    void pop();
    void push(int entry);
}




public class Exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DynamicStack ds=new DynamicStack(3);
		ds.push(4);
		ds.push(6);
		ds.push(8);
		ds.push(10);
		ds.pop();
		System.out.println("------------------------------------------");
		FixedStack fs=new FixedStack(2);
		fs.push(0);
		fs.push(8);
		fs.push(10);
		fs.pop();
		fs.pop();
		fs.pop();
		fs.pop();
		fs.push(9);


	}

}
