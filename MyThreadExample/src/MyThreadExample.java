class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+" "+i);
			//getState();
			//currentThread();
			
			
			
		}
		//currentThread();
	}
}

public class MyThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread t1 = new MyThread();
		t1.start();
		MyThread t2 = new MyThread();
		t2.start();
		//t1.getState();
	//	t1.currentThread();
		
		//t2.currentThread();
		//t1.getState();

	}

}
