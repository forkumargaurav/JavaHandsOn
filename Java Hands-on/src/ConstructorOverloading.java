// having many constructor with different parameter called constructor overloading
class A
{
	int i;
	float f;
		public A()
		{ i=5;
			f=2.9f;
		}
			public A(int k)
			{ i=k;
				f=i+k;
			
			}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();   //object creation new keyword is for memory allocation in heap
									//will call 1st constructor 
		System.out.println(obj.i);    
		System.out.println(obj.f);

		A obj1=new A(7);   //object creation new keyword is for memory allocation in heap
		                  // will call 2nd constructor
		System.out.println(obj1.i);
		System.out.println(obj1.f);
				
	}
// both constructor have different parameter and this is called overloading;
}
