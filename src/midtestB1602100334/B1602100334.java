package midtestB1602100334;



import java.awt.event.*;  
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;  
import java.util.*;  




public class B1602100334 {
   

	public static void main(String[] args) {  
		// TODO Auto-generated method stub
		Test6 m = new Test6();
		m.display();
		m.makeMenu();  
	//	Buttons btns = new Buttons();
      //  btns.display();
		
	}                   

	
   
         
}
  
class Test6 extends JFrame implements ActionListener
{
	
	JTextArea ta;
	JButton bts[]; //버튼 배열선언 
	JLabel label;
	JMenuBar  mb; //메뉴바
	JMenu mFile,mEdit,mHelp; //메뉴만들기  
	JMenuItem miNew,miOpen,miSave,miQuit;
	JMenuItem miCopy,miPaste,miCut;
	JMenuItem miHelp;
	/////////////////////////////서브메뉴
	JMenu mOut,mInfo;
	JMenuItem miPdf,miPrinter;
	JMenuItem miVer,miDir;
	JMenuItem miCanvas,micalc,Quiz,digital;
	JMenuItem mi2a;
	FileDialog open,save;//저장하기,열기대화상자
	Font f1;
	 String st="";
	
	
	         
	Test6()
	{
		
		ta = new JTextArea(20,25);//한줄에 10개입력가능,7줄입력창
		mb= new JMenuBar();
		mFile= new JMenu("File");
	  // mFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.ALT_MASK));
		//mFile.addActionListener(this);

		mEdit= new JMenu("Notice");
		//mEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.ALT_MASK));
		//mEdit.addActionListener(this);

		mHelp= new JMenu("Add"); //메뉴
		//mHelp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.ALT_MASK));
		//mHelp.addActionListener(this);
	   f1 = new Font("Monospaced",Font.ITALIC,20);
		
		miNew = new JMenuItem("New");
		miNew.setAccelerator(KeyStroke.getKeyStroke('N',InputEvent.CTRL_MASK));//Ctrl+N
		miNew.addActionListener(this);
		
		miOpen = new JMenuItem("Open");
		miOpen.setAccelerator(KeyStroke.getKeyStroke('O',InputEvent.CTRL_MASK));//Ctrl+O
		miOpen.addActionListener(this);

		miSave = new JMenuItem("Save");
		miSave.setAccelerator(KeyStroke.getKeyStroke('S',InputEvent.CTRL_MASK));//Ctrl+S
		miSave.addActionListener(this);

		miQuit = new JMenuItem("Quit");
		miQuit.setAccelerator(KeyStroke.getKeyStroke('Q',InputEvent.CTRL_MASK));//Ctrl+Q
		miQuit.addActionListener(this);
////////////////////////////////////
		//////////////////////////////////////////////////////////
		
		miCopy = new JMenuItem("Notice");
		miCopy.addActionListener(this);

		miCut = new JMenu("inFo");
		miPdf = new JMenuItem ("학번1602100334");//서브메뉴아이템
		miPrinter = new JMenuItem("이름=유성재");//서브메뉸아이템
		miHelp = new JMenuItem("Add");
		miHelp.addActionListener(this);
   
             //////////////서브메뉴만들기   
	
	
		micalc = new JMenuItem("계산기");
		micalc.addActionListener(this);
		miCanvas = new JMenuItem("그림판");
		miCanvas.addActionListener(this);
		Quiz =  new JMenuItem("Quiz");
		Quiz.addActionListener(this);
		digital =  new JMenuItem("digital");
		digital.addActionListener(this);
		open = new FileDialog(this,"내가만든열기",FileDialog.LOAD);
		save = new FileDialog(this,"내가만든 저장하기",FileDialog.SAVE);
		  mi2a = new JMenuItem("inFo");
		  

	
	}      
	void makeMenu() //메뉴를 붙이는 작업정의
	{   
		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mHelp);//메뉴바에 메뉴를 추가한다.  
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSave);
		
		mFile.add(miQuit);//파일메뉴에 메뉴아이템 추가
		
		mEdit.add(miCopy);
		
		mEdit.add(miCut);
		  
		miCut.add(miPdf);//서브메뉴에 서브메뉴아이템 추가
		miCut.add(miPrinter);//서브메뉴에 서브메뉴아이템 추가
		
		
		mHelp.add(micalc);
		mHelp.add(miCanvas);
		mHelp.add(Quiz);
		mHelp.add(digital);
		setJMenuBar(mb); //메뉴바를 프레임에 추가
      
          
	}    
	void display()
	{  
	   Container c =getContentPane(); //추가,컨테니어
		c.add(ta);    //추가,테스트필드
       c.setLayout(new FlowLayout());//추가,컨테니어배열 
		
	
		setLocation(500,500);//프레임 위치 설정
		setTitle("1602100334,b반,유성재");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
           
	    

}
		public void actionPerformed(ActionEvent e) {
		
				   
		if(e.getSource()==miQuit)  //나가기
		   
		{
		   System.exit(0);	
		}
		if(e.getSource()==miNew)
		{
			ta.setText("");
		}  
		if(e.getSource()==miOpen)
		{
			open.setVisible(true);
			String fileName=open.getDirectory()+open.getFile();
			try {
				FileInputStream fr =new FileInputStream(fileName);
				while(true) {
					int i=fr.read();
					if(i==-1)break;
					ta.append(""+(char)i);
				}  
				
			}
			catch(IOException ie) {
			
			}
		}
		if(e.getSource()==miSave)
		{
			
			save.setVisible(true);
			String fileName=save.getDirectory()+save.getFile();
			String saveTxt=ta.getText();
			try {
				FileWriter fw=new FileWriter(fileName);
				fw.write(saveTxt);  
				fw.close();
			}
			catch(Exception ee) {  
				  
			} 
		}
	    if(e.getSource()==miCopy)  
	    {  
	    	MyHelp dial = new MyHelp();
	    }         
	               
	    if(e.getSource()==miCanvas)
	    {         
	    	 LineDrawEx c2=new LineDrawEx();
	    	 c2.display();
	    }    
	    if(e.getSource()==micalc)
	    {
	    	Calc mm = new Calc();  
	    	mm.display();  
	    }   
	    if(e.getSource()==Quiz) {
	    	picpuzzle2 mp1 = new picpuzzle2();
//		mp1.display();  
	    
		}       
	    if(e.getSource()==digital) {
	    	DigitalClock mp2 = new DigitalClock();
//	mp2.display();
	    
		}    
		}

		/*  
		public void openDocument()
		 {  
		   JFileChooser chooser=new JFileChooser();
		  System.out.println(chooser.getFileFilter() );
		   chooser.setDialogTitle("파일 열기");
		   int returnVal=chooser.showOpenDialog(this);
		   if(returnVal !=JFileChooser.APPROVE_OPTION)//cancel 버튼이 눌려지면 취소
		    return;
		    File f=chooser.getSelectedFile();//대화상자에서 선택된 파일객체 인스턴스를 구한다
		   
		   if(!f.exists())   
		   {//파일이 존재하지 않으면 에러 메세지를 띄운후 취소
		     File file = null;
			JOptionPane.showMessageDialog(this,file.getName()+" 파일을 찾을 수 없습니다.",
		      "파일 열기 에러",JOptionPane.ERROR_MESSAGE);
		      return;
		   }
		  openFile(f);   
		 }///////////////////////openDocument() ////////////////////
		 
		
		 
		
		

private void openFile(File f) {
			// TODO Auto-generated method stub
			
		}
private void saveDocument(boolean b) {
			// TODO Auto-generated method stub
	boolean isSaveAs;
	if(isSaveAs==true)
	  {//새이름으로 저장할 경우 파일 대화상자 표시
	   JFileChooser chooser=new JFileChooser();
	   chooser.setDialogTitle("새 이름으로 저장");
	   int returnVal=chooser.showSaveDialog(this);
		}
*/

class MyHelp extends JDialog
{
	JButton btn;
	JLabel LA;
	Font f1;
	MyHelp()
	{
		LA= new JLabel("fighting!!");
		f1 = new Font("Monospaced",Font.ITALIC,100);
		LA.setFont(f1);
		LA.setForeground(Color.BLUE);
		btn= new JButton("Close");
		add(btn);
		add(LA);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {  
				// TODO Auto-generated method stub
				setVisible(false);
				//System.exit(0);setVisible(false);
			}
		});
    add(btn,BorderLayout.NORTH);
	setVisible(true);
	setSize(800,500);
	setTitle("NOTICE");
	
	
}
} 
		}

			
/*class Buttons extends JFrame
{
	
	JButton bts[];//버튼 배열선언 
	 Buttons() {
		// TODO Auto-generated constructor stub
	    bts = new JButton[10];//배열자릿수 설정
	    for(int i=0;i<10;i++)
	    {  
	    	bts[i]= new JButton(""+i);
	    	add(bts[i]);
	    			
	    }
	 }

	 
	 */
	 
	 
	 
	 /*
   void display()
   { 
	   
	   //setLayout(new GridLayout(0, 2)); //가로 
	  // setLayout(new GridLayout(1, 3)); 세로
	 //  setLayout(new GridLayout(2, 5,10,20));//public GridLayout(int rows,int cols,int hgap,int vgap)
	   setSize(300, 300);
	   setVisible(true);
	   setTitle("내가만든버튼들");
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

*/

