package Thread;

public class Threads {	
	public static void main(String[] args) {
		MyThread thread1=new MyThread("thread1: ");
		MyThread thread2=new MyThread("thread2: ");
         thread1.start();
         thread2.start();
        boolean thread1IsAlive=true;
        boolean thread2IsAlive=true;
        do
        {
        	if(thread1IsAlive && thread1.isAlive())
        	{
        		thread1IsAlive=false;
        		System.out.println("Thread1 is dead");
        	}
        	if(thread2IsAlive && thread2.isAlive())
        	{
        		thread2IsAlive=false;
        		System.out.println("Thread2 is dead");
        	}
        }
        while(thread1IsAlive || thread2IsAlive);
        System.out.println("");
	}
	
}
class MyThread extends Thread
{
	static String text[]= {"Java","is","hot",",","aromatic","and","invigorating."};
	public MyThread(String id)
	{
		super(id);
	}	
	public void run()
	{
		String name=getName();
		for(int i=0;i<text.length;++i)
		{
			randomWait();
			System.out.println(name+text[i]);
		}
	}	


void randomWait()
{
	try
	{
		sleep((long)(1000*Math.random()));
	}
	catch(Exception e)
	{
		System.out.println("Interrupted!");
	}
}
}
