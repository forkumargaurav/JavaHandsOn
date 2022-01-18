//Question 1
import java.util.*;
class Clock
{
	int hours, minutes, seconds;
	Clock(int h,int m, int s)
	{
		hours=h;
		minutes=m;
		seconds=s;
	}
	
	void validate_time()
	{
		if (hours >=0 && hours <24 && minutes >0 && minutes<60 && seconds>0 && seconds<60)
			System.out.println("Time is Valid");
		else
		{
			System.out.println("Time is not Valid");
			System.exit(0);
		}
	}
	
	void Set_Time_Mode()
	{
		if (hours<12)
			System.out.println("Time = " +hours+ ":"+minutes+ ":"+seconds+"AM" );
		else
		{
			hours=hours-12;
			System.out.println("Time = " +hours+ ":"+minutes+ ":"+seconds+"PM");
		}
	}
}
public class Question1 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter hours");
		int hours = obj.nextInt();
		System.out.println("Enter minutes");
		int minutes = obj.nextInt();
		System.out.println("Enter seconds");
		int seconds = obj.nextInt();
		
		Clock c1= new Clock(hours,minutes,seconds);
		c1.validate_time();
		c1.Set_Time_Mode();	
	}
}
