package exercise_6;

class FixedStack implements Stack{
	int stackSize;
	int[] stackArray;
	int top;
	
	FixedStack(int size)
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
		return;
	}
	
	public boolean isStackEmpty() {
	    return (top == -1);
	}
	
	 
	boolean isStackFull() {
	    return (top == stackSize - 1);
	}
	
	public void push(int entry) {
		// TODO Auto-generated method stub
		if(isStackFull()){
	    	System.out.println("Stack Overflow");
	    	return;
		}
		System.out.println("Adding: "+entry);
	        stackArray[++top] = entry;
		
	}
}

