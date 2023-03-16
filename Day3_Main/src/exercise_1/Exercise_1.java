package exercise_1;

public class Exercise_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable even = new EvenRunnable();//func interface
        Thread evenThread = new Thread(even);
        evenThread.start();
        Runnable odd = new OddRunnable();
        Thread oddThread = new Thread(odd);
        oddThread.start();
    }
}

class OddRunnable implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 1)
                System.out.println(i);
        }
    }
}

class EvenRunnable implements Runnable{
    public void run(){
        for(int i=0;i<11;i++){
            if(i%2 == 0)
                System.out.println(i);
        }
    }
}