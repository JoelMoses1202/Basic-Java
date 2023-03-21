package exercise_8;

class Square implements CalcArea{
	 float area,perimeter;
	 Square(float side){
		 area=area(side);
		 perimeter=4*side;
		 
	 }
	
	public float area(float side)
	{
		return 6*side*side;
	}
	public float volume(float side) {
		return side*side*side;
		
	}
}