package com.infinite.jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmploySortEx {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		 employList.add(new Employ(1, "swathi" , 99943));
		 employList.add(new Employ(2, "madhu" , 94945));
		 employList.add(new Employ(3, "bhargavi" , 89943));
		 employList.add(new Employ(4, "pavani" , 87943));
		 employList.add(new Employ(5, "sahithi" , 78943));
		 
		 Collections.sort(employList, (e1, e2) -> {
			 return e1.getName().compareTo(e2.getName());
		 });
		 
		 System.out.println("Sort By Name ");
		 employList.forEach(System.out::println);
		 System.out.println("Sort By Basic-Wise ");
		 Collections.sort(employList, (e1, e2) -> {
			 return (int) (e1.getBasic() - e2.getBasic());
		 });
		  employList.forEach(System.out::println);
	}

}
