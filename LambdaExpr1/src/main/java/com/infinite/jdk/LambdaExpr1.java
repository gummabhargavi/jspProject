package com.infinite.jdk;

interface Hello {
	void sayHello();
}
public class LambdaExpr1 {
     
	public static void main(String[] args) {
		Hello obj1 = () ->{
		  System.out.println("Welcome to jdk 1.8 new features....");	
		};
		obj1.sayHello();
	}
}
