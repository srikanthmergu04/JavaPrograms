import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class FrequencyOfElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n;
		System.out.println("Enter No of Elements");
		Scanner sc  = new Scanner(System.in);
		n = sc.nextInt();
		int i=0;
		while(i<n)
		{
			Integer value = sc.nextInt();
			arr.add(value);
			i++;
		}
		
		for(i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr.get(i)>arr.get(j))
				{
					Integer t1 = arr.get(i);
					Integer t2 = arr.get(j);
					arr.set(i, t2);
					arr.set(j, t1);
				}
			}
				
		}
		/*
		Iterator it = arr.iterator();
		while(it.hasNext())
		{
		 System.out.println(it.next());	
		}
		*/
		i=0;
		int j=1;
		HashMap<Integer,Integer> myMap = new HashMap<Integer,Integer>();
	while(i<n)
	{
		int count = 1;
		while(j<n)
		{
			if(arr.get(i) == arr.get(j))
			{
				j++;
				count++;
			}
			else
			{
				break;
			}
			
		}
		myMap.put(arr.get(i), count);
		i = j;
		
		j = i+1;
		
		
	}
	System.out.println(myMap);
	}

}
