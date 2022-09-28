package Assignment2;

public class ExceptionHandling {
public static void main(String args[])
{
	int a=5,  b=0, ans=0;
	try {
		ans=a/b;
		System.out.println("the answer is:" +ans);
	}
	catch (ArithmeticException e) {
		System.out.println("Exception case");
	}
	finally
	{
		System.out.println("Number not divisible by 0");
	}
			
}
}
