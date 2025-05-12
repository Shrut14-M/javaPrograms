package com.constructorInBuiltMethods;

public class Student {
String Name;
int age;           //if Local and global variable have same name then we use 'this.' keyword.
public Student(String Name, int age) {
	this.Name = Name;
	this.age = age;
}
@Override
public String toString() {      //toString is a method which returns a representation of the object.
	return "Student [Name=" + Name + ", age=" + age + "]";
}


}
