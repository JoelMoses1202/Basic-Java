package exercise_8;




interface CalcArea
{
	public float area(float radius);
}

interface CalcVolume{
	public float  volume(float radius);
}



 
 
 

 



public class Exercise_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere c=new Sphere(8);
		System.out.println(c.area+" "+c.perimeter+" "+c.surfaceArea+" "+c.volume);
		
		
		
		

	}

}
