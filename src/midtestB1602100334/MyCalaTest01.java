package midtestB1602100334;


import java.awt.FlowLayout;  
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyCalaTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              Calc cl =new Calc();
              cl.display();
	}   

}

class Calc extends JFrame implements ActionListener{
	JTextField tf;
	JPanel panel;
	JButton btn[]; //0-9., =, clear
	JButton opBtn[]; //연산자+-*/
	String op1="",op2="";//텍스트 필드에 보여질 피연산자
	String operator;//+ - * /
	float i,j,k; // 연산을위한변수
	Calc()
	{  
		tf= new JTextField(30);
		tf.setHorizontalAlignment(4);
		add(tf);
		panel = new JPanel(new GridLayout(4, 4 ,4, 4));//public GridLayout(int rows,int cols,int hgap,int vgap)
		btn = new JButton[12]; //0-9,=,CLEAR
		opBtn = new JButton[4]; 
		for(int i=0;i<10;i++)
		{
			btn[i]= new JButton(""+i);
			btn[i].addActionListener(this);
			panel.add(btn[i]); //패널에 버튼추가
		}
		btn[10] = new JButton("=");
		btn[10].addActionListener(this);
		panel.add(btn[10]);
		btn[11] = new JButton("Clear");
		btn[11].addActionListener(this);
		panel.add(btn[11]);
		opBtn[0] = new JButton("+");		opBtn[1] = new JButton("-");
		opBtn[2] = new JButton("*");
		opBtn[3] = new JButton("/");

		for(int i=0;i<4;i++)
		{
			opBtn[i].addActionListener(this);
			panel.add(opBtn[i]);
		}
		
	}
	void display() {
		setLayout(new FlowLayout());
		add(panel);
		setTitle("내가만든계산기");
		setVisible(true);
		setSize(400, 300);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn[11])
		{
			op1="";
		
			tf.setText(op1);
		}
		for(int i=0;i<10;i++) {
			
		
         if(e.getSource()==btn[i])
         {
        	   
               op1 +=e.getActionCommand();
               tf.setText(op1);
        	 //tf.setText(e.getActionCommand());//버튼의 타이틀값 보여준다.        	 
         }
         
		}
		if((e.getActionCommand()=="+")|(e.getActionCommand()=="-")|(e.getActionCommand()=="*")|(e.getActionCommand()=="/"))
{
	     operator=e.getActionCommand();
	     op2=op1;
	     op1="";
	     i=Float.parseFloat(op2);//첫번째 피연산자 연산가능해짐
}
		if(e.getActionCommand()=="=") {
		j=Float.parseFloat(op1); //두번째 피연산자 연산가능해짐
		tf.setText(""+oper(operator,i,j));//연산하는 함수호출
		
		}
		  
		}

 public float oper(String operator,float i,float j) {
     if(operator.equals("+"))//객체비교
    	 k=i+j;
     else if(operator.equals("-"))
     {
    	 k= i-j;
     }
     else if(operator.equals("*"))
     {
    	 k= i*j;
     }
     else if(operator.equals("/"))
     {
    	 k= i/j;
     }
	 return k; 
 }
}
 