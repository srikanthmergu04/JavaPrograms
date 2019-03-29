class Product{
	
	int pid;
	String name;
	int price;
	
	Product()
	{
		//this.color = color;
		System.out.println("Product Object Created");
	}
	void setProductDetails(int pid,String name,int price)
	{
		this.pid = pid;
		this.name = name;
		this.price = price;
	}
	
	void showProductDetails()
	{
		System.out.println("Product Details are : ");
		System.out.println("pid = "+pid);
		System.out.println("name = "+name);
		System.out.println("price = "+price);
	}
	

}
class mobile extends Product{  //Implementing Inheritance
	
	String os;
	int ram;
	int storage;
	mobile()
	{
		System.out.println("mobile object created");
	}
	//Method Overloading
	void setProductDetails(int pid,String name,int price,String os,int ram,int storage)
	{
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.os = os;
		this.ram = ram;
		this.storage = storage;
	}
	
	void showProductDetails() //Method Overriding
	{
		
		System.out.println("Product Details are : ");
		System.out.println("pid = "+pid);
		System.out.println("name = "+name);
		System.out.println("price = "+price);
		System.out.println("android version = "+os);
		System.out.println("ram = "+ram);
		System.out.println("storage = "+storage);
	}
}


public class InheritanceTest
{
	public static void main(String args[])
	{
		/*
		Product p1 = new Product();
		p1.setProductDetails(101, "Samsung note 9", 45000);
		p1.showProductDetails();
		*/
	
		mobile m1 = new mobile();
		mobile m2 = new mobile();
		m1.setProductDetails(101, "Mi A1", 15000, "Android -Pie", 4, 64);
		m1.showProductDetails();
		System.out.println("--------------------------------------------\n");
		m2.pid = 102;
		m2.name = "Xiomi Note 6 Pro";
		m2.os = "Android - Oreo";
		m2.price = 13000;
		m2.ram = 4;
		m2.storage = 64;
		m2.showProductDetails();
	}
}