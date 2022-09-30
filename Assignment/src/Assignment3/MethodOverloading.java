package Assignment3;

public class MethodOverloading {
	 public int sum(int a, int b)
		{
		  int sum = a+b;
		  return sum;
	}
	  public int sum(int x, int y, int z)
	  {
		  int sum = x+y+z;
		  return sum;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading obj=new MethodOverloading();
         obj.sum(2,4);
         obj.sum(2,3,4);
	}

	} 


