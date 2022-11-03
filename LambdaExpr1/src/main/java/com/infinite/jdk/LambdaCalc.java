package com.infinite.jdk;

interface ICalc{
	int calc(int a, int b);
}
public class LambdaCalc {
	
	public static void main(String[] args) {
		ICalc obj1 = (a, b) ->{
		  return a+b;	
		};
		System.out.println("Sum is " +obj1.calc(12, 5));
		ICalc obj2 = (a, b) ->{
			return a-b;
		};
		System.out.println("sub is " +obj2.calc(12, 5));
		ICalc obj3 = (a, b) ->{
			return a*b;
		};
		System.out.println("Mul is " +obj3.calc(12, 5));
	}

}
