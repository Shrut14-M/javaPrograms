package com.constructorInBuiltMethods;

public class Laptop {
String brand;
int ram;
int storage;
public Laptop(String brand, int ram, int storage) {
   this.brand= brand;
   this.ram= ram;
   this.storage= storage;
   
 
}
@Override
public String toString() {
	return "Laptop [brand=" + brand + ", ram=" + ram + ", storage=" + storage + "]";
}
}
