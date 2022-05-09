package com.Area;

public class Test {

	public static void main(String[] args) {
		Shape s;
		s=new Shape();
		System.out.println(s.area());
		
		s=new Rectangle(10, 20);
		System.out.println(+s.area());
		
		s=new Triangle(10, 20);
		System.out.println(s.area());
		
		
		

	}

}
