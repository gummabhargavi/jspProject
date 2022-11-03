package com.infinite.jdk;

@FunctionalInterface
interface IConvert{
	double convert(double c);
}
public class FunctionalInterface1 {
           
	public static void main(String[] args) {
		IConvert obj1 = (c) ->{
			return c+273;
		};
		System.out.println("Kelvin value " +obj1.convert(23));
		IConvert obj2 = (c) ->{
			return ((9*c)/5)+32;
		};
		System.out.println("Forgin value " +obj2.convert(37));
	}
}
