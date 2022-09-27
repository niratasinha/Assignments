package Assignment1;

public class Model extends Feature{

	@Override
	void Handgear() {
		// TODO Auto-generated method stub
		System.out.println("It has handgear feature");
	}

	@Override
	void Autogear() {
		// TODO Auto-generated method stub
		System.out.println("It has autogear feature");
	}
public static void main (String[]args) {
	Feature f1 = new Model();
	f1.Handgear();
	f1.Autogear();
	
}
}
