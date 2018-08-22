package com.example.try_catch;

public class Demo {
	void disp(long a, double b) {
		System.out.println("Method A");
	}
	void disp ( int s, double b double c) {
		System.out.printint("Method B");
	}
	public static void main(string args[]) {
		Demo obj= new Demo();
		/*
		 * in an passing float value as a cecond argument but it hot promoted to the type double, becoude there wasnt any method habin arg list an int float
	obj.isp (100,2067	 */
		obj.disp (100,2067);	
	}
	

}
