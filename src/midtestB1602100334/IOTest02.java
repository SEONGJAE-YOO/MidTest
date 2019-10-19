package midtestB1602100334;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest02 {   
    
	public static void main(String[] args) throws IOException{
		
		
		//파일에 쓰기 
		FileInputStream fis=new FileInputStream("d:\\a.txt");  //읽고
	//	FileInputStream fis=new FileInputStream("d:\\a.png");  //읽고
		FileOutputStream fos= new FileOutputStream("d:\\aa.txt"); //쓰기
		//FileOutputStream fos= new FileOutputStream("d:\\aa.png"); //쓰기
        while(true) {
        	int i=fis.read();//읽기
        	if(i==-1) break;
        	fos.write(i);//쓰고
        }
        	fos.close();//닫기
        	
        	
        }		
	/*	//stream 출력
		int data[] = {97,98,99,100,101,13,10};
		char cdata[]= {'h','e','l','l','o'};
		       
		FileOutputStream fis = new FileOutputStream("d:\\d.txt");
	    DataOutputStream dos = new DataOutputStream(fis);
		for(int i=0;i<data.length;i++) {
			
			dos.write(data[i]);
		}
		for(int i=0;i<cdata.length;i++) 
		{
			dos.write(cdata[i]);
		}
		
		*/
/*	  FileInputStream fis=new FileInputStream("d:\\a.txt");
       while(true) {  
    	   int i=fis.read();   
    	   if(i==-1)break;
    	   System.out.print((char)i);
       }*/
	}
                
