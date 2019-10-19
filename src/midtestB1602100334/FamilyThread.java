package midtestB1602100334;

import javax.swing.JFrame;

public class FamilyThread  extends Thread{
	Toilet toilet;
	String who;
	
	FamilyThread(String name,Toilet to){
		who = name;
		toilet = to;
	}

 public void run() {
	  toilet.use(who);
  
  }  

	  public static void main(String[] args) {
		  Toilet toilet = new Toilet();
		  FamilyThread a =new FamilyThread("A",toilet);
		  FamilyThread b =new FamilyThread("B",toilet);

		  FamilyThread c =new FamilyThread("C",toilet);
		  a.start();
		  b.start();
		  c.start();
	  
	  }  

}
class Toilet {
	synchronized void use(String name)
	{
		System.out.println(name+"들어감");
		System.out.println(name+"사용중...");
		System.out.println(name+"나옴");


}
}