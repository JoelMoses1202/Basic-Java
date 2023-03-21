package exercise_3;

public class Exercise_3 {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println("PASS BY REFERENCE");
		int arr[]= {1,3,4,5,6,7};
		
		Car car=new Car();
		PassByReference pbr=new PassByReference();
		pbr.met_car(car);
		pbr.met_arr(arr);
		System.out.println(car.model);
		System.out.println(arr[1]);
		
		
		System.out.println("------------------------------");
		System.out.println("PASS BY VALUE");
		boolean var_boolean=true;
		byte var_byte=0;
		short var_short=1;
		int var_int=2;
		long var_long=4l;
		float var_float=1.0f;
		double var_double=1.33d;
		char var_char='a';
		
		PassByValue pbv=new PassByValue();
		pbv.metBool(var_boolean);
		pbv.metByte(var_byte);
		pbv.metShort(var_short);
		pbv.metInt(var_int);
		pbv.metLong(var_long);
		pbv.metFloat(var_float);
		pbv.metDouble(var_double);
		pbv.metChar(var_char);

		System.out.println(var_boolean);
		System.out.println(var_short);
		System.out.println(var_byte);
		System.out.println(var_int);
		System.out.println(var_long);
		System.out.println(var_float);
		System.out.println(var_char);

		
		
		
		
		
		
		
		
	}
}



