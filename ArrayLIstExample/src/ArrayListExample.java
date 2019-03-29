
import java.util.ArrayList;
import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> employee = new ArrayList<Integer>();
		
		int i=0,j=101;
		for(i=0;i<10;i++)
		{
			employee.add(j);
			j++;
		}
		i=0;
		//normal While loop
		System.out.println("--------------------------------------------");
		System.out.println("--------Using Nornal loop--------");
		while(i<employee.size())
		{
			System.out.println(employee.get(i));
			i++;
		}
		System.out.println("--------------------------------------------");
		System.out.println("--------Using Enhanced for loop--------");
		//Enhaned for loop
		for(Integer emp : employee)
		{
			//System.out.println(employee.get(name));
			System.out.println(emp);
		}
		System.out.println("--------------------------------------------");
		System.out.println("--------Using Iterator--------");
		
		Iterator it = employee.iterator();
		
	/*	while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		for(;it.hasNext();)
		{
			System.out.println(it.next());
		}
		
		
		System.out.println("--------------------------------------------");
		
		
	
		

	}

}
