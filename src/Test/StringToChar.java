package Test;

import java.util.Arrays;
import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
	    String str=sc.next();
	    char[] ch=str.toCharArray();
	    System.out.println(Arrays.toString(ch));
	    

	}

}
