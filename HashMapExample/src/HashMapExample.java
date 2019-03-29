import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String Args[])
	{
		Map<Integer,String> EmpDetails = new HashMap<Integer,String>();
		//@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		//int j=1;
		int i =0;
		String str = new String();
		Integer j = 101;
	//	System.out.println("Hello , World !");
		
		while(i<3)
		{
			//Integer a = sc.nextInt();
			//System.out.println(i);
			System.out.println("enter a String");
			str = scan.next();
		//	System.out.println("Hello , World !");
			System.out.println("enter a integer");
			j = scan.nextInt();
			
			EmpDetails.put(j, str);
			j++;
			i++;
			
		}
		scan.close();
		System.out.println(EmpDetails);
		
	    //using Iterator 
		/*
	    Iterator<Map.Entry<Integer, String>> it = EmpDetails.entrySet().iterator();
	    while(it.hasNext())
	    {
	    	Map.Entry<Integer, String> entry  = it.next();
	    	System.out.println(entry.getKey()+" , "+entry.getValue());
	    }
	    */
		EmpDetails.forEach((k,v)->System.out.println("key = "+k+"value = "+v));
	}

}
