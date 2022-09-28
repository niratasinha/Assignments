package Assignment2;

public class Super1 {
	String name="nirata";
}
class Super2 extends Super1
{
	String name="sinha";
	void printname()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
}
class test{
	public static void main(String args[])
	{
		// TODO Auto-generated method stub
Super2 t=new Super2();
t.printname();
	}
	}


