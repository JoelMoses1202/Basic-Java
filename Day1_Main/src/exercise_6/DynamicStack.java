package exercise_6;

class DynamicStack implements Stack{
	int stackSize;
	int[] stackArray;
	int top;
	
	DynamicStack(int size)
	{
		    stackSize = size;
		    stackArray = new int[stackSize];
		    top = -1;
	}
	public void pop(){
	    if(isStackEmpty()){
	    	System.out.println("Stack underflow.");
	    	return;
		}
		int entry = this.stackArray[top--];
		System.out.println("Removed entry: "+entry);
		return ;
	}
	
	public boolean isStackEmpty() {
	    return (top == -1);
	}
	
	
	
	public void push(int entry)  {
	    if(isStackFull()){
	    	System.out.println("Stack Overflow");
	    increaseStackCapacity();
		}
		System.out.println("Adding: "+entry);
	        stackArray[++top] = entry;
	}
	
	 void increaseStackCapacity(){	         
	    int[] newStack = new int[stackSize+1];
	    for(int i=0;i<stackSize;i++){
	        newStack[i] = stackArray[i];
	    }
	    stackArray = newStack;
	    stackSize =stackSize+1;
	}
	 
	boolean isStackFull() {
	    return (top == stackSize - 1);
	}
}
