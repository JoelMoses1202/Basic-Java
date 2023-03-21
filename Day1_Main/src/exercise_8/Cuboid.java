package exercise_8;

class Cuboid extends 	Square implements CalcVolume{
	 float surfaceArea,volume;
	 Cuboid(float side){
		 super(side);
		 surfaceArea=surfaceArea(side);
		 volume=volume(side);
		 
	 }
	
	public float surfaceArea(float side)
	{
		return 6*side*side;
	}
	public float volume(float side) {
		return side*side*side;
		
	}
}