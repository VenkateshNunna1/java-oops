package com.java.forech_method;

import java.util.ArrayList;
import java.util.List;



public class Foreachex {
  public static void main(String args[]) {
	  Foreach1 f= new Foreach1();
	  List<Integer> l = new ArrayList<>();
	  l.add(10);
	  l.add(20);
	  l.add(24);
	  l.add(89);
//	  for(Integer i:l) {
//		  System.out.println(i);
	  //}
	 l.forEach(f);
  }
}
