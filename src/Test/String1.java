package Test;

import java.util.Scanner;

public class String1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		System.out.println("Enter the String");
		int count=0;
		System.out.println("the vowels in given sting are:");
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='a'||s1.charAt(i)=='u')
			{
				System.out.println(i+" ");
			}
		}
		System.out.println("The no.of vowels are:"+count);
	}

}
