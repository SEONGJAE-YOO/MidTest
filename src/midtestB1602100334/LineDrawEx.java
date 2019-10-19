package midtestB1602100334;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;

public class LineDrawEx extends JFrame {
    
 public LineDrawEx(){
  setContentPane(new MyPanel());
  setSize(300,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }
 
 class MyPanel extends JPanel{
  
  Point startP=null;
  Point endP=null;  
  
  Vector<Point> sv = new Vector<Point>(); // 시작
  Vector<Point> se = new Vector<Point>(); // 끝점

  public MyPanel(){
   //리스너를 공통으로해야  변수들이 공유된다.
   MyMouseListener ml = new MyMouseListener();
     
   this.addMouseListener(ml); // 리스너
   this.addMouseMotionListener(ml);
  }
  
  public void paintComponent(Graphics g){
   super.paintComponent(g); // 부모 페인트호출
   
   if(sv.size() != 0){
    for(int i=0;i<se.size();i++){ //벡터크기만큼
     Point sp = sv.get(i); // 벡터값을꺼내다
     Point ep = se.get(i); 
     g.drawLine(sp.x, sp.y, ep.x, ep.y);//그리다
    }
   }
   if(startP != null)
    g.drawLine(startP.x, startP.y, endP.x, endP.y);    
  }
  
  class MyMouseListener extends MouseAdapter implements MouseMotionListener{
   public void mousePressed(MouseEvent e){
    startP = e.getPoint();
    sv.add(e.getPoint()); // 클릭한부분을 시작점으로
   }
   public void mouseReleased(MouseEvent e){
    se.add(e.getPoint()); // 드래그 한부분을 종료점으로
    endP = e.getPoint();
    repaint(); // 다시그려라
   }
   
   public void mouseDragged(MouseEvent e){
    endP = e.getPoint();
    repaint();
   }
   
   public void mouseMoved(MouseEvent e){
    
   }
  }
 }
 
 public static void main(String[] args) {
	 LineDrawEx c2=new LineDrawEx();
	 c2.display();
 }
 public void display() {
	 MyPanel cc = new MyPanel();
 }
 
}
