package com.example.try_catch;

public class StaticVsDynamic {
	
	class Animal {
		public  void walk() {
		System.out.println("animal Walks");
	}

}
public class StaticVsDynamic extends Animal{
	public  void walk() {
		System.out.println("Car Walks");
	}
	public static  void main(String[]args) {
		StaticVsDynamic obj1 = new StaticVsDynamic();
		obj1.walk();
		Animal obj2 = new Animal();
		obj2.walk();
		
	}
}
public void walk() {
	// TODO Auto-generated method stub
	
}