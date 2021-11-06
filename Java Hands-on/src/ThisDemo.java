// this specify the variable is instance variable not a local variable it both have same name 

class casio
{
	int num1, num2, result; //instance variable
	public casio(int num1, int num2 )
	{
		//local variable //local region
		//num1=num1; //this has no error but here the o/p will be 0 which is default value of num1
					// and num2 as the compiler is unable to understand which variable is instance or local
		//num2=num2;
		this.num1=num1; // using "this" is specify which variable is instance variable
		this.num2=num2;
		result =num1+num2;
	}
}
public class ThisDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casio obj=new casio(4,5);
		System.out.println("Result of num1+num2 is :"+obj.result);

	}

}
