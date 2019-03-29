import java.util.ArrayList;
import java.util.Scanner;

public class SortingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter no of elements");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			Integer value = sc.nextInt();
			arr.add(value);
		}
	//	System.out.println("hello world");
		/*
		for(Integer val : arr)
		{
			System.out.println(val);
		}
		*/
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr.get(i)>arr.get(j))
				{
					Integer t1 = arr.get(i);
					Integer t2 = arr.get(j);
					//arr.add(i,t2);
					//arr.add(j, t1);
					
					arr.set(i, t2);
					arr.set(j, t1);
					
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.printf(" "+arr.get(i));
		}

	}

}
