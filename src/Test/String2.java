package Test;

import java.util.Scanner;

public class String2 { 
	public static void m1(char[] ch,int len)
	{
		 if(len>0)
	    {
	    	System.out.print(ch[len-1]);
	    	len--;
	    	m1(ch,len);
	    }
	}
		public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter String:");
    String str=sc.next();
    char[] ch=str.toCharArray();
    int len=ch.length;
    System.out.println("Enter String:"+len);
        m1(ch,len);
	}

}
