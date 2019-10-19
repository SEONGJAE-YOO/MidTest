package midtestB1602100334;

public class MyThread01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread t1= new Thread01();
		Thread t2= new Thread02();
		Thread t3= new Thread03();//쓰레드 객체화
	
		t1.start(); //쓰레드의 run호출
		t2.start();
		t3.start();

//다중처리한다고 해서 속도가 빨라지지 않는다.
		//프로세스-샐행중인 하나의 어플리케이션
		//멀티쓰레드-하나의 프로세스가 두가지 이상의 작업을 처리할수 있게 함
		
	}

}

class Thread01 extends Thread //implements Runnable 
{
	public void run()
	{
		for(int i=0;i<9;i++)
		{
			try {
				Thread.sleep(1000);//0.2초
				System.out.print(i);
				}
				catch (InterruptedException ir) {
					// TODO: handle exception
				}
		}
		
	}
}

class Thread02 extends Thread
{
	public void run()
	{
		for(char ch='a';ch<='z';ch++)
		{
			try {
			Thread.sleep(500);//0.2초
			System.out.print(ch);
			}
			catch (InterruptedException ir) {
				// TODO: handle exception
			}
		}
		
	}
}

class Thread03 extends Thread
{
	public void run()
	{
		for(char ch='A';ch<='Z';ch++)
		{
			try {
			Thread.sleep(200);//0.2초
			System.out.print(ch);
			}
			catch (InterruptedException ir) {
				// TODO: handle exception
			}
		}
		
	}
}