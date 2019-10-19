package midtestB1602100334;

public class TestThread03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 Thread t1 =new Thread13("A");
		 t1.start();
	     Thread t2 =new Thread13("B");
	     t2.start();  
	     
	}

}

class Thread13 extends Thread
{
	String myName;
	Thread13(String name)
	{
		myName=name;
	}
	public void run()
	{
		for(int i=1;i<10;i++)
		{
			try {
				Thread.sleep(1000);//0.2초
				System.out.print(myName+":"+i+"");
				}  
				catch (InterruptedException ir) {
					// TODO: handle exception
				}
			
		}
	}
}