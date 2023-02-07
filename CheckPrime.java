package week1.day2;

public class CheckPrime {

	public static void main(String[] args) {
		int n=6;
		boolean Isprime = true;
		
		for(int i=2;i<=n-1;i++)
		{
			if(n%i== 0)
			Isprime = false;
			
		}	
		if(Isprime==false)
		{
System.out.println("Not a prime number");

}
		else
		{
			System.out.println("prime number");
		}
	}
	
}