package midtestB1602100334;

public class MyThread02 {
	public static void main(String[] args) {

	Thread t3 = new Thread(new Thread23("A"));
	t3.start();
	Thread t4 = new Thread(new Thread23("B"));
	t4.start();
}

}

class Thread23 implements Runnable
{
	String myName;
	Thread23(String name)
	{
		myName=name;
	}
	public void run()
	{
		for(int i=1;i<10;i++) {
			System.out.print(myName+":"+i+"");
		}
	}
}
  