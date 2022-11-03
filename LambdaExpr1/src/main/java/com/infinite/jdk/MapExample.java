package com.infinite.jdk;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		 employList.add(new Employ(1, "swathi" , 99943));
		 employList.add(new Employ(2, "madhu" , 94945));
		 employList.add(new Employ(3, "bhargavi" , 89943));
		 employList.add(new Employ(4, "pavani" , 87943));
		 employList.add(new Employ(5, "sahithi" , 78943));
		 
		 List<String> mapDemo = 
		  employList.stream().map(x -> x.getName()).collect(Collectors.toList());
	    System.out.println("Employ Names");
	    mapDemo.forEach(System.out::println);
	}

}
