package demo.Core.CollectionsDemo;

public class Test1 implements Comparable{
	
	
	public static void main(String [] args) {
	
		
		Runnable t1=()->{
			for (int i=0;i<5;i++)
			{
		
			System.out.println("A");
			try {Thread.sleep(300);} catch(Exception e) {}
		}};
		
		
		Runnable t2=()->
		{
			for (int i=0;i<5;i++)
			{
			System.out.println("B");
			try {Thread.sleep(300);} catch(Exception e) {}
		}};
		
		Thread t3=new Thread(t1);
		Thread t4=new Thread(t2);
		t3.start();
		try {Thread.sleep(30);} catch(Exception e) {}
		t4.start();
	}
}