package com.app;

public class Main {

	public static void main(String[] args) {
		
		Model m=new Model(1, "abc", 1234);
		Model m1=new Model(2, "pqr", 576);
		
		Model m2=new Model(1, "xyz", 465464);
		
		Model m3=new Model(1, "xyz", 465464);
		Model m4=new Model(222, "xyz", 999999);
		
		System.out.println(m3);
		
	}
}
