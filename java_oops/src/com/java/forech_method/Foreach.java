package com.java.forech_method;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


public class Foreach {
 public static void main(String args[]) {
	 List<Integer> list = new ArrayList<>();
	 list.add(10);
	 list.add(20);
	 list.add(30);
	 list.add(59);
	 list.forEach(i->System.out.println(i));//here forEach() internally calls the accept() abstract 
//method of consumer interface. 
 
 }


}
