package example1;
  
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MycountDown1 extends JFrame {
  JLabel count;
   MycountDown1() {  
	count = new JLabel("start");
	count.setFont(new Font("궁서",Font.BOLD,50));
	add(count);
	   
	   // TODO Auto-generated constructor stub
}    
   void display()
   {
	   setLayout(new FlowLayout());
	   setSize(300,300);   
	   setVisible(true);
	   setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	   Thread t1 = new Thread(new TimerCount());
	   t1.start();                
   }  
   class TimerCount implements Runnable
   {
	   public void run()
	   {
		   for(int i=10;i>=0;i--)             
		   {     
			   System.out.print(i);  
		   try {
			   Thread.sleep(1000);
			   count.setText(""+i);
		   
		   }
	   catch (InterruptedException ir) {
		// TODO: handle exception
	
   }
		   }
	   }
   }
}