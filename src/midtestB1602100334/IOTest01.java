package midtestB1602100334;

import java.io.IOException;
import java.io.InputStream;
import java.io.*;

public class IOTest01 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//데이터를 버퍼에 넣고 한번에 읽는다.
		InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is); //2바이트로 문자처리가능 
		BufferedReader br= new BufferedReader(isr); //버퍼에 데이터를 저장
	    String s=br.readLine();
		System.out.println(s);
		//문자단위로 데이터를 읽는다.
	/*	InputStream is=System.in;
		InputStreamReader isr=new InputStreamReader(is); //2바이트로 문자처리가능 
		BufferedReader br= new BufferedReader(isr); //버퍼에 데이터를 저장
		
		while(true) {
			
		
		int a=isr.read();
		if((a==13)||(a==10)) break;   
		System.out.print(a);   
		
		}
		*/
		//자바의 1바이트 단위로 읽고 쓰기 
	/*	InputStream is=System.in;//스트림을 통한 입력
		int a =is.read();
		int b =is.read();
		int c =is.read();
		int d =is.read();
		int e =is.read();

		System.out.println(a); //97
		System.out.println(b); 
		System.out.println(c); 
		System.out.println(d); 
		System.out.println(e);*/ 
		//자바의 표준 입출력을 이용한것 
/*		while(true)
		{
			int a= System.in.read();//자바표준입렵
			if((a==13)||(a==10)) break; // 개행제어 엔터값
			System.out.write(a); //a out은 표준출력
			System.out.println((char)a); //97
}
			*/
            
		}

}


