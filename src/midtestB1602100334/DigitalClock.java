package midtestB1602100334;


import java.awt.FlowLayout;     
import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable{
    Thread thread;
	 JLabel label;

	public DigitalClock(){

		setLayout(new FlowLayout());  

		label = new JLabel();
		label.setFont(new Font("궁서",Font.PLAIN, 20));

		if(thread == null){
			
			
			thread = new Thread(this);
			thread.start();  
		}
		add(label);
		setBounds(100,100,400,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public static void main(String[] args) {
		DigitalClock d2 = new DigitalClock();
//		d2.display();
		JFrame.setDefaultLookAndFeelDecorated(true);
		new DigitalClock();
	}  
//	public void display() {
//		DigitalClock d2 = new DigitalClock();
//         
//	}    
	public void run(){
		while(true){
			Calendar cal = Calendar.getInstance();
			String now = cal.get(Calendar.YEAR)+"년 "+
					(cal.get(Calendar.MONTH)+1)+"월 "+
					cal.get(Calendar.DATE)+"일 "+
					cal.get(Calendar.HOUR)+"시 "+
					cal.get(Calendar.MINUTE)+"분 "+
					cal.get(Calendar.SECOND)+"초 ";
			label.setText(now); 
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}