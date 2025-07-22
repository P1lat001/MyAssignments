package Week1_Assignments;

import java.util.Scanner;

public class BooleanPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
		//int num =10;
		boolean isPrime =true;
		if (n<=1)
		{
			 isPrime= false;
		}
		else
		{
			for (int i=2;i<=n/2;i++)
			{
				if (n%i==0)
				{
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime)
		{
			System.out.println(n+" is prime number");
		}
		else 
		{
			System.out.println(n+" is not prime number");
		}

	}

}
