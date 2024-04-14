package com.java.Exceptionhandling;

public class a {
    public static void main(String args[]){
    	int a=10;
    	int b=0;
    	try {
    		int c=a/b;
    	}
    	catch(ArithmeticException e) {
    		b=10;
    		int c=a/b;
    		System.out.println(c);
    		System.out.println("hi venkatesh");
    	}
    	finally {
    		System.out.println("hii hello ");
    	}
    	System.out.println("hello");
    	}
    	
}
