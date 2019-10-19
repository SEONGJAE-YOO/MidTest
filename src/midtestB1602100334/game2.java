package midtestB1602100334;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.*;  

import javax.swing.*;
import java.awt.event.*;

public class game2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		MyPuzzle mp1 = new MyPuzzle();
		mp1.display();
		
	}

}

class MyPuzzle extends JFrame  implements ActionListener  
{
     JButton btn[];
     JButton reset;
     JPanel panel;
	 Font myfont;
	 Color mycolor;     
	 ImageIcon img;

	 MyPuzzle()
	 {
		img=new ImageIcon("img.jpg");
		// img=new  ImageIcon("img2.jpg");
		 




		 myfont = new Font("Serif",Font.PLAIN|Font.ITALIC,30);
		 mycolor = new Color(115, 115, 0);
		 panel =new JPanel(new GridLayout(4, 4,2,2));
		//  img = new ImageIcon(getClass().getResource("midtestB1602100334\img.jpg"));
			
		   btn=new JButton[16];
		   for(int i=0;i<16;i++)
		   {
			   
			   btn[i]=new JButton(""+(i+10),img);
			   //btn[i]=new JButton(""+i);

			   btn[i].setFont(myfont);
			   btn[i].setBackground(mycolor);
			   btn[i].setForeground(Color.blue);
			   btn[i].addActionListener(this);
			  panel.add(btn[i]);
		   }
		  
	          //btn[15].setText("");
	          reset= new JButton("reset");
	          reset.setFont(myfont);
	          reset.setBackground(Color.blue);
	          reset.setForeground(mycolor);
	          reset.addActionListener(this);
	 }
	 public void paintComponet(Graphics g) {
		 super.paintComponents(g);
		 g.setFont(myfont);   
		 g.drawString("Serif 20 points PLAIN", 10, 50);
	 }
	
	 void display()
	 {
		  setLayout(new BorderLayout(5,5));
		    add(panel,BorderLayout.CENTER);
		    add(reset,BorderLayout.NORTH);
		 setTitle("쉬어가기");  
		 setSize(1900,1500);
		 setVisible(true);
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
	 }
	 
	
	@Override
	public void actionPerformed(ActionEvent e) {  
      if(btn[8].getText().equals("")) {
	   if(e.getSource()==btn[5]) {
		   btn[8].setIcon(btn[5].getIcon());
		   btn[5].setIcon(null);
	   }
      }
      if(btn[5].getText().equals(""))
      {
	   if(e.getSource()==btn[4]) {
		   btn[5].setIcon(btn[4].getIcon());
		   btn[4].setIcon(null);
	   }
      }
	    if(btn[4].getText().equals(""))
	      {
		   if(e.getSource()==btn[3]) {
			   btn[4].setIcon(btn[3].getIcon());
			   btn[3].setIcon(null);
		   }
	      }
		    if(btn[3].getText().equals(""))
		      {
			   if(e.getSource()==btn[0]) {
				   btn[3].setIcon(btn[0].getIcon());
				   btn[0].setIcon(null);
			   }
		      }
		    if(btn[2].getText().equals(""))
		      {
			   if(e.getSource()==btn[1]) {
				   btn[2].setIcon(btn[1].getIcon());
				   btn[1].setIcon(null);
			   }
		      }
		    if(btn[0].getText().equals(""))
		      {
			   if(e.getSource()==btn[1]) {
				   btn[0].setIcon(btn[1].getIcon());
				   btn[1].setIcon(null);
			   }
		      }
		    if(btn[1].getText().equals(""))
		      {
			   if(e.getSource()==btn[2]) {
				   btn[1].setIcon(btn[2].getIcon());
				   btn[2].setIcon(null);
				   
			   }
			       
			 if(e.getSource()==btn[5]) {
					   btn[1].setIcon(btn[5].getIcon());
					   btn[5].setIcon(null);
				   }
			      
		      }
		    if(btn[2].getText().equals(""))
		      {
			   if(e.getSource()==btn[5]) {
				   btn[2].setIcon(btn[5].getIcon());
				   btn[5].setIcon(null);
			   }
		      }
		    if(btn[5].getText().equals(""))
		      {
			   if(e.getSource()==btn[8]) {
				   btn[5].setIcon(btn[8].getIcon());
				   btn[8].setIcon(null);
			   }
			   if(e.getSource()==btn[9]) {
				   btn[5].setIcon(btn[9].getIcon());
				   btn[9].setIcon(null);
			   }
		      }
		    if(btn[8].getText().equals(""))
		      {
			   if(e.getSource()==btn[7]) {
				   btn[8].setIcon(btn[7].getIcon());
				   btn[7].setIcon(null);
			   }
		      }
		    if(btn[7].getText().equals(""))
		      {
			   if(e.getSource()==btn[6]) {
				   btn[7].setIcon(btn[6].getIcon());
				   btn[6].setIcon(null);
			   }
		      }
		    if(btn[6].getText().equals(""))
		      {
			   if(e.getSource()==btn[3]) {
				   btn[6].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
			   if(e.getSource()==btn[5]) {
				   btn[6].setIcon(btn[5].getIcon());
				   btn[5].setIcon(null);
			   }
		      }
		    if(btn[7].getText().equals(""))
		      {
			   if(e.getSource()==btn[4]) {
				   btn[7].setIcon(btn[4].getIcon());
				   btn[4].setIcon(null);
			   }
		      }
		    if(btn[4].getText().equals(""))
		      {
			   if(e.getSource()==btn[3]) {
				   btn[4].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
		      }
		    if(btn[6].getText().equals(""))
		      {
			   if(e.getSource()==btn[3]) {
				   btn[6].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
		      }
		    if(btn[3].getText().equals(""))
		      {
			   if(e.getSource()==btn[6]) {
				   btn[3].setIcon(btn[6].getIcon());
				   btn[6].setIcon(null);
			   }
		      }
		    if(btn[6].getText().equals(""))
		      {
			   if(e.getSource()==btn[3]) {
				   btn[6].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
		      }
		    if(btn[3].getText().equals(""))
		      {
			   if(e.getSource()==btn[4]) {
				   btn[3].setIcon(btn[4].getIcon());
				   btn[4].setIcon(null);
			   }
		      }
		    if(btn[4].getText().equals(""))
		      {
			   if(e.getSource()==btn[7]) {
				   btn[4].setIcon(btn[7].getIcon());
				   btn[7].setIcon(null);
			   }
 		      }
		    if(btn[7].getText().equals(""))
		      {
			   if(e.getSource()==btn[6]) {
				   btn[7].setIcon(btn[6].getIcon());
				   btn[6].setIcon(null);
			   }
			   if(e.getSource()==btn[3]) {
				   btn[7].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
		      }      
		    if(btn[4].getText().equals(""))
		      {
			   if(e.getSource()==btn[0]) {
				   btn[4].setIcon(btn[0].getIcon());
				   btn[0].setIcon(null);
			   }
			   if(e.getSource()==btn[1]) {
				   btn[4].setIcon(btn[1].getIcon());
				   btn[1].setIcon(null);
			   }
				
		      }  
		     
		    if(btn[5].getText().equals(""))
		      {
			   if(e.getSource()==btn[1]) {
				   btn[5].setIcon(btn[1].getIcon());
				   btn[1].setIcon(null);
			   }
		      }  
		    if(btn[8].getText().equals(""))
		      {
			   if(e.getSource()==btn[4]) {
				   btn[8].setIcon(btn[4].getIcon());
				   btn[4].setIcon(null);
			   }
			   if(e.getSource()==btn[9]) {
				   btn[8].setIcon(btn[9].getIcon());
				   btn[9].setIcon(null);
			   }
			   
		      }  
		    if(btn[4].getText().equals(""))
		      {
			   if(e.getSource()==btn[1]) {
				   btn[4].setIcon(btn[1].getIcon());
				   btn[1].setIcon(null);
			   }
		      }  
		    if(btn[2].getText().equals(""))
		      {
			   if(e.getSource()==btn[3]) {
				   btn[2].setIcon(btn[3].getIcon());
				   btn[3].setIcon(null);
			   }
		      }  
		    if(btn[7].getText().equals(""))
		      {
			   if(e.getSource()==btn[11]) {
				   btn[7].setIcon(btn[11].getIcon());
				   btn[11].setIcon(null);
			   }
		      }                     
		    if(btn[3].getText().equals(""))
		      {
			   if(e.getSource()==btn[7]) {
				   btn[3].setIcon(btn[7].getIcon());
				   btn[7].setIcon(null);
			   }
		      }  
		    if(btn[11].getText().equals(""))
		      {
			   if(e.getSource()==btn[15]) {
				   btn[11].setIcon(btn[15].getIcon());
				   btn[15].setIcon(null);
			   }
		      }  
		    if(btn[15].getText().equals(""))
		      {
			   if(e.getSource()==btn[14]) {
				   btn[15].setIcon(btn[14].getIcon());
				   btn[14].setIcon(null);
			   }
		      }  
		    if(btn[15].getText().equals(""))
		      {
			   if(e.getSource()==btn[14]) {
				   btn[15].setIcon(btn[14].getIcon());
				   btn[14].setIcon(null);
			   }
		      }  
		    if(btn[14].getText().equals(""))
		      {
			   if(e.getSource()==btn[13]) {
				   btn[14].setIcon(btn[13].getIcon());
				   btn[13].setIcon(null);
			   }
			   if(e.getSource()==btn[15]) {
				   btn[14].setIcon(btn[15].getIcon());
				   btn[15].setIcon(null);
			   }
		      }  
		    if(btn[13].getText().equals(""))
		      {
			   if(e.getSource()==btn[12]) {
				   btn[13].setIcon(btn[12].getIcon());
				   btn[12].setIcon(null);
			   }
			   else if(e.getSource()==btn[14]) {
				   btn[13].setIcon(btn[14].getIcon());
				   btn[14].setIcon(null);
			   }
		      }  
		    if(btn[12].getText().equals(""))
		      {
			   if(e.getSource()==btn[8]) {
				   btn[12].setIcon(btn[8].getIcon());
				   btn[8].setIcon(null);
			   }
			   else if(e.getSource()==btn[13]) {
				   btn[12].setIcon(btn[13].getIcon());
				   btn[13].setIcon(null);
			   }
		      }  
		    if(btn[9].getText().equals(""))
		      {
			   if(e.getSource()==btn[8]) {
				   btn[9].setIcon(btn[8].getIcon());
				   btn[8].setIcon(null);
			   }
			   if(e.getSource()==btn[10]) {
				   btn[9].setIcon(btn[10].getIcon());
				   btn[10].setIcon(null);
			   }
			   if(e.getSource()==btn[5]) {
				   btn[9].setIcon(btn[5].getIcon());  
				   btn[5].setIcon(null);
			   }
			   if(e.getSource()==btn[8]) {
				   btn[9].setIcon(btn[8].getIcon());
				   btn[8].setIcon(null);
			   }
		      }  
		    if(e.getSource()==reset)
		    {
		    	//난수함수호촐
		    	int u[]=MyPuzzle.makeRnum();//배열 안에 난수가 있음
		    	for(int i=0;i<15;i++)
		    	{
		    		
		    		btn[i].setIcon(img);
		    		btn[i].setText(""+u[i]);
		    	}
		    	btn[8].setText("");
		    	btn[8].setIcon(null);
		    	
		    }
	}
	static int[] makeRnum()
	{
		Random r =new Random();//랜덤클래스
		int result[]=new int[15];
		int x=0;
		for(int i=0;i<15;i++) {
			result[i]=r.nextInt(15)+10; //1-8
		 for(int k=0;k<i;k++)
		 {
			 if(result[i]==result[k])
			 {
				 x=r.nextInt(15)+1;
                 result[i]=x;
                 i--;
                 break;  
                 
			 }
		 }
		}
		return result;  
	}
}
