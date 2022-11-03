package com.infinite.jdk;

import java.util.ArrayList;
import java.util.List;

public class LambdaEmploy {
	
	public static void main(String[] args) {
		 List<Employ> employList = new ArrayList<Employ>();
		 employList.add(new Employ(1, "swathi" , 99943));
		 employList.add(new Employ(2, "madhu" , 94945));
		 employList.add(new Employ(3, "bhargavi" , 89943));
		 employList.add(new Employ(4, "pavani" , 87943));
		 employList.add(new Employ(5, "sahithi" , 78943));
		 System.out.println("Employ List ");
		 employList.forEach(x -> {
			 System.out.println(x);
		 });
		 employList.forEach(System.out::println);
	}

}
