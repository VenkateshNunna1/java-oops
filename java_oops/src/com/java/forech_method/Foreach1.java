package com.java.forech_method;

import java.util.function.Consumer;

public class Foreach1 implements Consumer<Integer>{
     @Override
	public void accept(Integer i) {
		System.out.println("hello");
		System.out.println(i);
	}

}
