package com.java.StaticAndNonstatic;



class Test{
	static int i;
	static void m1(int i1) {
		i=i1;
	}
	void m2(Test t) {
		i=t.i;
	}
	void m3() {
		System.out.println(i);
	}
}
class main1{
	public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.i);
		t1.m1(47);
		System.out.println(t1.i);
		t1.m2(t1);
		System.out.println(t1.i);
		
	}
}