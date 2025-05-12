package com.constructorInBuiltMethods;

public class ProductDetails {
	public static void main(String[] args) {
		Product p= new Product(21,"Facewash", 400);
		System.out.println(p.equals(p));  //equals is a method of Object class.

		System.out.println(p);
	}
}
