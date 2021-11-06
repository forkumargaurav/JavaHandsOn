/*
 Analogy
 class is a blue print which is used to build a building (object)
 to build any object your JVM (java virtual machine) need a structure which is a class
 
 Object has 2 thing 1.It knows something (Data type)
 					2.It does something (behaviour)
 		e.g
 		Object: Dog 
 					data type: color, name, breed;
 					behaviour: barking, wagging,fetching;
 */

class calc
{
	int num1,num2,result;
	/*
	 *  by default every class has constructor which looks like this 
	 *  public calc()
	 *  {
	 *  }
	 */
	public void perform() //method defined ()
	{
		result=num1+num2;
	}
}
public class ClassAndObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj=new calc(); //constructor calling as same name as class created constructor only allocates memory
		obj.num1=3;
		obj.num2=4;
		obj.perform();  //calling method to get result
		System.out.println(obj.result); //result print	
	}

}
