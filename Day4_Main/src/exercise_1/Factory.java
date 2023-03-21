package exercise_1;

public class Factory {
	public SS make(String product) {
		if(product == null){
	         return null;
	      }		
	      if(product.equalsIgnoreCase("bat")){
	         return new Bat();
	         
	      } else if(product.equalsIgnoreCase("ball")){
	         return new Ball();
	         
	      } else if(product.equalsIgnoreCase("gloves")){
	         return new Gloves();
	      }
	      
	      return null;
		
	}

}
