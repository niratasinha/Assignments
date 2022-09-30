package Assignment3;

//public class MethodOverriding {
  class school{
		void open()
		{System.out.println("school is open");
	}
public class highschool extends school{
	void open()
	{System.out.println("highschool is close");
}
}
public class faculty{
	
	//public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		school s = new school();
		school s1 = new highschool();
		s.open();
		s1.open();
	}
	}
}
	
