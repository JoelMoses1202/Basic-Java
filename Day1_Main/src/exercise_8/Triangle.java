package exercise_8;

class Triangle implements CalcArea{
	 float area,perimeter;
	 Triangle(float side1,float side2,float side3){
		 perimeter=side1+side2+side3;
		 double s=(side1+side2+side3)/2;
		 area=area(side1,side2,side3,s);
}
	
	public float area(float side1,float side2,float side3, double s) {
		
		return(float) (Math.sqrt(s*(s-side1)*(s-side2)*(s-side3)));
	}

	@Override
	public float area(float radius) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}