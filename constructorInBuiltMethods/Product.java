package com.constructorInBuiltMethods;

public class Product {
int productid;
String productName;
int price;
public Product(int productid, String productName, int price) {
this.productid= productid;
this.productName=productName;
this.price=price;

}
@Override
public String toString() {
	return "Product [productid=" + productid + ", productName=" + productName + ", price=" + price + "]";
}
}
