package midtestB1602100334;

public class TestThread02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Thread t4 =new Thread(new Thread11());
     Thread t5 =new Thread(new Thread06());

     Thread t6 =new Thread(new Thread04());
     t6.setPriority(Thread.MAX_PRIORITY);
     t4.setPriority(Thread.MIN_PRIORITY);
       t4.start();
       //t5.start();

       t6.start();
         
	}

}

class Thread11 implements Runnable
{
	public void run() {
		for(int i=0;i<=9;i++)
		{
			System.out.print(i);
		}
	}
}
class Thread06 implements Runnable
{
	public void run() {
		for(char ch='a';ch<='z';ch++)
		{
		
			System.out.print(ch);
		}
	}
}
class Thread04 implements Runnable
{
	public void run() {
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print(ch);
		}
	}
}