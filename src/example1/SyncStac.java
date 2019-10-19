package example1;
import java.util.*;

class SyncStack{  
	private Vector buffer = new Vector();
	public synchronized char pop(){
		char c;
		while(buffer.size()==0){
		try{
			System.out.println("stack대기:");
			this.wait();
		}catch(Exception e){}
	}
	Character cr = ((Character)buffer.remove(buffer.size()-1));
	c = cr.charValue();
	System.out.println("stack삭제:" + c);
	return c;
}

public synchronized void push(char c){
	this.notify();
	Character charObj = new Character(c);
	buffer.addElement(charObj);
	System.out.println("stack삽입:" + c);
	}
}

class PopRunnable extends Thread{
	public void run(){
		SyncStac.ss.pop();
	}
}
            
class PushRunnable extends Thread{
	private char c;
	
	public PushRunnable(char c){
	this.c =c;
	}

	public void run(){
		SyncStac.ss.push(c);
	}
}

public class SyncStac {
	public static SyncStack ss =new SyncStack();
	public static void main(String[] args){                                                          

	//SyncStack에 5데이터삽입

	new PushRunnable('J').start();
	new PushRunnable('A').start();
	new PushRunnable('B').start();
	new PushRunnable('O').start();
	new PushRunnable('O').start();

	new PopRunnable().start();//O
	new PopRunnable().start();//O
	new PopRunnable().start();//B
	new PopRunnable().start();//A
	new PopRunnable().start();//J

	new PopRunnable().start();//대기상태  

	try{
		Thread.sleep(5000);
	}catch(Exception e){}
		System.out.println("===== passed 5 seconds======");
	new PushRunnable('K').start();
	}
}