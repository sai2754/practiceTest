package Test;
import java.util.Arrays;
import java.util.Scanner;

public class CharToString {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter No.of characters:");
		for(int i=0;i<n;i++)
		{ 
			char[] ch=new char[n];
			System.out.println("Enter character1:");
			ch[i]=sc.next().charAt(i);
			System.out.println(Arrays.toString(ch));
		}
     }

}
