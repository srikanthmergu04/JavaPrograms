class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable thread id = "+Thread.currentThread().getId());
		PrintMessage();
	
	}
	void PrintMessage()
	{
		System.out.println("Hello , World!");
	}
	
}
public class RunnableThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable t = new MyThread();
		Thread t1 = new Thread(t);
		
		System.out.println("Before Thread.start() ");
		t1.start();
		
		System.out.println("After Thread.start() ");

	}

}
