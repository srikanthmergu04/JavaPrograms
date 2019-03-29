import java.util.ArrayList;

import java.util.*;;

public class HashMap_ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		ArrayList<String> arr = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		String str = new String();
	   for(int i=0;i<4;i++)
	   {
		   System.out.println("Enter an Element");
		   str = sc.next();
		   arr.add(str);
	   }
	   sc.close();
	   
	   HashMap<Integer,Object> myMap1 = new HashMap<Integer,Object>();
	   
	    myMap1.put(101, arr);
	    System.out.println(myMap1);
	    

	   
	}


}
