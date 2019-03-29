import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student{
	String name;
	int rollno;
	int percentage;
	Student(String n,int i,int p)
	{
		System.out.println("Student Object Created");
		this.name = n;
		this.rollno = i;
		this.percentage = p;
	}
	
}

class sortbyrollno implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
	//	System.out.println("comparing 2 rollno's");
		//Student s1 = (Student)o1;
		//Student s2 = (Student)o2;
		
		if(s1.rollno == s2.rollno)
		{
			System.out.println("Comparing "+s1.rollno+" & "+s2.rollno+" "+s1.rollno+" Both are Equal ");
			return 0;
		}
		else if(s1.rollno>s2.rollno)
		{
			System.out.println("Comparing "+s1.rollno+" & "+s2.rollno+" "+s1.rollno+" is greater");
			return 1;
		}
		else
		{
			System.out.println("Comparing "+s1.rollno+" & "+s2.rollno+" "+s1.rollno+" is smaller");
			return -1;
		}
		
		
	}
	
	
	
	
}

class sortbyname implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		System.out.println("comparing "+s1.name+"& "+s2.name);
		// TODO Auto-generated method stub
	//	System.out.println("comparing 2 names's");
		//Student s1 = (Student)o1;
		//Student s2 = (Student)o2;
		//return 0;
	//	System.out.println("s1.name = "+s1.name+" s2.name = "+s2.name);
		//System.out.println(s1.name.compareTo(s2.name));
		return s1.name.compareTo(s2.name);
	}
	
}

class sortbypercentage implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		
		
		if(s1.percentage>s2.percentage)
		{
			System.out.println("Comparing "+s1.percentage+" & "+s2.percentage+" "+s1.percentage+"is greater");
			return 1;
		}
			
		else if (s1.percentage<s2.percentage)
		{
			System.out.println("Comparing "+s1.percentage+" & "+s2.percentage+" "+s1.percentage+"is smaller");
		//	System.out.println("Comparing "+s1.percentage+" & "+s2.percentage);
			return -1;
		}
			
		else
		{
			System.out.println("Comparing "+s1.percentage+" & "+s2.percentage+" "+s1.percentage+" both are equal");
			//System.out.println("Comparing "+s1.percentage+" & "+s2.percentage);
			return 0;
		}
			
		//return 0;
	}
	
}

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("abc",101,75);
		Student s2 = new Student("bcd",103,70);
		Student s3 = new Student("cde",102,68);
		
		ArrayList<Student> st = new ArrayList<Student>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		System.out.println("UnSorted list : ");
		for(Student st1 : st)
		{
			System.out.println(" Student name = "+st1.name+" roll no = "+st1.rollno+" percentage = "+st1.percentage);	
		}
		
		System.out.println();
		Collections.sort(st, new sortbypercentage());
		System.out.println("Sorting By  Percentage : ");
				
				for(Student st2 : st)
				{
					System.out.println(" Student name = "+st2.name+" roll no = "+st2.rollno+" percentage = "+st2.percentage);	
				}
				
		System.out.println();
		
		Collections.sort(st, new sortbyname());
		System.out.println("Sorting By  name : ");
				
				for(Student st2 : st)
				{
					System.out.println(" Student name = "+st2.name+" roll no = "+st2.rollno+" percentage = "+st2.percentage);	
				}
				System.out.println();
		
		Collections.sort(st, new sortbyrollno());
		
		System.out.println("Sorting By  RollNo : ");
		
		for(Student st1 : st)
		{
			System.out.println(" Student name = "+st1.name+" roll no = "+st1.rollno+" percentage = "+st1.percentage);	
		}
		System.out.println();
		
		
		
	

	}

}
