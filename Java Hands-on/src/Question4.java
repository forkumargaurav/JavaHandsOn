//Question4
class Bank{
public int getBalance()
{ return 0; }
}

class BankA extends Bank{

public int getBalance(int balance) 
{ return balance; }

}

class BankB extends Bank{

public int getBalance(int balance) 
{ return balance; }

}

class BankC extends Bank{

public int getBalance(int balance) 
{ return balance; }
}

public class Question4 {

	public static void main(String[] args) {
		BankA A = new BankA();
		BankB B = new BankB(); BankC C = new BankC();
		System.out.println("BankA Balance : Rs" +A.getBalance(1000));
		System.out.println("BankB Balance : Rs" +B.getBalance(1500));
		System.out.println("BankC Balance : Rs" +C.getBalance(2000));
	}
}
