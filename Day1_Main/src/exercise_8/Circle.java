package exercise_8;

class Circle implements CalcArea{
	 float area,perimeter;
	 Circle(float radius){
		 area=area(radius);
    	 perimeter=2*3.14f*radius;
    	 
		
	 }
	@Override
	public float area(float radius) {
		// TODO Auto-generated method stub
		return (3.14f*radius*radius);
	}
}
