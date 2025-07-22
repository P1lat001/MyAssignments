package Week1_Assignments;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		System.out.print("Fibonnaci Series : ");
		for(int i=1;i<=8;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}

	}

}
