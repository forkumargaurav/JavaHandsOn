//use of static key word
//using static keyword we call use method without creating object i.e. in main method
//we need object and you can not create object without method.
//but with static we can call method without creating object
//**static variable are same for all the objects**
//***non-static variable are different for all the object***

//*** can not use non-static variable in static block
class emp
{
	int eid,salary;
	static String ceo; //static is used for making ceo as 
	
	static      // run when we load the class
	{
		ceo="Gaurav";
		System.out.println("Static called");  //for multiple static block it follow the sequence
	}
	
	/*public emp()
	{
		ceo="daut";  // either we can use static or constructor for ceo as in constructor 
					//we used to define default value
					// every time we create an obeject it call constructor but static called only one time hence save time for any such default data type like ceo
		System.out.println("constructor called");
	}*/
		public void show_emp() //method
		{
			System.out.println(eid+":"+salary+":"+ceo);
		}
}
public class StaticDemo {
			//int non_static_variable=90; //we can use if we make it a static variable 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print(non_static_varibale); //give error as non-static variable can't be used in static block
		emp navin=new emp(); //navin object create
		navin.eid=9090;
		navin.salary=2000;
		//emp.ceo="Gaurav"; //for static we can either use object or class name to define
							//or we can use static in class for such static variable.
		navin.show_emp();  //method calling 
		
		emp rahul=new emp();
		rahul.eid=2380;
		rahul.salary=3000;
		//we do not need to define ceo for rahul again as we did in above using class name.ceo
		//which is for static String ceo; so applied for all the object in class emp.		
		rahul.show_emp();
	}

}
