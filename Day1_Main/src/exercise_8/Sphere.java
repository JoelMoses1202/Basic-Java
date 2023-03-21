package exercise_8;

class Sphere extends Circle implements CalcVolume{
	 float surfaceArea,volume;
	 Sphere(float radius){
		 super(radius);
		 
		 surfaceArea=surfaceArea(radius);
		 volume=volume(radius);
	 }
	 
	 
	
	public float surfaceArea(float radius)
	{
		return 4*3.14f*radius*radius;
	}
	public float volume(float radius) {
		return (4*3.14f*radius*radius*radius)/3;
		
	}
}