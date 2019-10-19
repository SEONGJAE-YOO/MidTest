package midtestB1602100334;

import java.util.Random;

import javax.swing.JFrame;

public class MyFrame001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFRAME mf1 = new MyFRAME();
		mf1.display();  
	}

}

class MyFRAME extends JFrame implements Runnable 
{
	Thread t1;
	MyFRAME()
	{
		t1 = new Thread(this);
		t1.start();
	}
	void display()
	{
		setTitle("멀미나는 프레임");
		setSize(300, 300);
        setLocation(500, 300);
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	@Override
	public void run() {
		Random r = new Random();
		while(true) {
		try {
		Thread.sleep(50);//0.05
		}
		catch (InterruptedException ie) {
			// TODO: handle exception
		}
		int x=getX()+r.nextInt()%5; 
		int y=getY()+r.nextInt()%5;

            setLocation(x, y);
            
	}
}
}