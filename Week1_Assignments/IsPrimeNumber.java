package Week1_Assignments;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int num =30;
		int count =0;
		for (int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println(num+" is Prime Number");
		}
		else 
		{
			System.out.println(num+" is Not Prime Number");
		}

	}

}
