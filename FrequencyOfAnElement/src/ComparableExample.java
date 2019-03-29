import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>
{
	String name;
    int price;
    Book(String n,int d)
    {
    	this.name  = n;
    	this.price = d;
    }
	@Override
	public int compareTo(Book b) {
		// TODO Auto-generated method stub
		if(this.price == b.price)
			return 0;
		else if(this.price>this.price)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
    
    
    
}
public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b1 = new Book("Head First Java",750);
		Book b2 = new Book("Let Us C",300);
		
		ArrayList<Book> bk1 = new ArrayList<Book>();
		bk1.add(b1);
		bk1.add(b2);
		Collections.sort(bk1);
		
		for(Book b : bk1)
		{
			System.out.println("Book name : "+b.name+" price = "+b.price);
		}
		
		
		
		

	}

}
