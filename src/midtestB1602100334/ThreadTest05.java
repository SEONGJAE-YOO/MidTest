package midtestB1602100334;



public class ThreadTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Thread t1= new Thread40();
		 t1.start();
	  
	     
	}

}

class Thread40 extends Thread
{
	
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			try {
				Thread.sleep(1000);//0.2초
				System.out.println(i);
				}  
				catch (InterruptedException ir) {
					// TODO: handle exception
				}
		
		}
		System.out.println("finish");

	}
}