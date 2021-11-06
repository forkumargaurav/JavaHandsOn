//continue and break
//continue skip on iteration loop 
//break exit the iterartion loop
public class ControlStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			if(i==4)
			{
				//continue; //at i==4 it will skip the iteration loop
				break; // at i=4 it it will exit the iteration loop
			}
			System.out.println(i);
		}

	}

}
