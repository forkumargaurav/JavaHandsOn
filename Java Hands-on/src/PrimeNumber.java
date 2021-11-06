//prime number
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=8,count=0;
		
		for(int j=1;j<=num;j++)
		{
			if(num%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Number given "+num+" is prime");
		}
		else
			System.out.println("Number given "+num+" is not a prime");
	}

}
