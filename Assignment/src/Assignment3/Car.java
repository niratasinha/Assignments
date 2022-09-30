package Assignment3;

public class Car extends Vehicle {

	@Override
	void model1() {
		// TODO Auto-generated method stub
		System.out.println("SUV");
	}

	@Override
	void capacity1() {
		// TODO Auto-generated method stub
		System.out.println("7-seater");
	}

public static void main(String[] args) {
	Vehicle v1 = new Car();
	  v1.model1();
	  v1.capacity1();
}
}

