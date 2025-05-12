package com.constructorInBuiltMethods;

public class Rectangle {
int length;
int width;
int area;

public Rectangle(int length,int width) {
	this.length=length;
	this.width=width;
	int area= length*width;
	System.out.println(area);

	
}

@Override
public String toString() {
	return "area [length=" + length + ", width=" + width + "]";
}

}
