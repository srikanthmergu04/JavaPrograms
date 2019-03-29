import java.util.*;;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no Entries");
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String>[] arr = new ArrayList[n];

		for(int i=0;i<n;i++)
		{
			arr[i] = new ArrayList<String>();
		}
		
		HashMap<Integer,Object> myMap = new HashMap<Integer,Object>();
		
		for(int i=0;i<n;i++)
		{
			int key;
			int skills;
			System.out.println("Enter Employee ID");
			key = sc.nextInt();
			System.out.println("Enter no of skills you want to add");
			skills = sc.nextInt();
			String str = new String();
			System.out.println("add "+skills+" skills");
			for(int j=0;j<skills;j++)
			{
				//System.out.println("Enter Skill "+j);
				str = sc.next();
				arr[i].add(str);
			}
			
			myMap.put(key, arr[i]);
		}
		
		System.out.println(myMap);
		

	}

}
