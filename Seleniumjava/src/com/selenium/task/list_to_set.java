package com.selenium.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class list_to_set {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("acc");
		a.add("bcc");
		a.add("cdd");
// Print the List
System.out.println("before List: " + a);
//Set<String> b = new HashSet<String>(a);
//System.out.println("after converting into set:"+b);

//set into list
Set<String> c = new HashSet<String>();
c.add(null);
c.add("java");
c.add(":656");
List<String> d= new ArrayList<String>(c);
System.err.println(d);
	}

}
