class MathTable{
	
	
	public static synchronized void PrintTable(int n)
	{
		for(int i=1;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" in PrintTable Method");
			System.out.printf(" %d * %d = %d\n",n,i,n*i);
		}
		System.out.println();
	}
	
}
class MyThread1 extends Thread{
	MathTable t1 = new MathTable();
	int n;
	MyThread1(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		t1.PrintTable(n);
	}
}
class MyThread2 extends Thread{
	MathTable t1 = new MathTable();
	int n;
	MyThread2(int n)
	{
		this.n = n;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		t1.PrintTable(n);
	}
}
public class SynchronizationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread1 m1 = new MyThread1(2);
		m1.setName("Srikanth");
		MyThread2 m2 = new MyThread2(3);
		m2.setName("vinayak");
		m1.start();
		m2.start();

	}

}
