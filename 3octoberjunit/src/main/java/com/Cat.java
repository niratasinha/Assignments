package com;
// concept of inheritance

public class Cat extends Animal{

	@Override
	String move() {
		// TODO Auto-generated method stub
		return "walk";
	}

	@Override
	String call() {
		// TODO Auto-generated method stub
		return "meow";
	}
	
	//method overloading
	
	String call(String a,String b) {
		return "cat is walking";
	}
	}



