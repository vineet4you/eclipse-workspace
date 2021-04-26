package demo.Core.Logic;

import java.util.Scanner;

public class StringApp {

	public boolean isPalindrome()
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		String s1="";
		
		for(int i=s.length()-1;i>=0;i--)
		{		
			s1+=c[i];			
		}
		if(s1.equals(s))
			return true;
		else
			return false;
	}
	public int check(String s2,int low,int high)
	{
		
		while(low<high)
		{
			if(s2.charAt(low)!=s2.charAt(high))
				return high;
			high--;
			low++;
		}
		return 1;
	}
	public static void main(String[] args)
	{
		if (isPalindrome())
			System.out.println("Already palindrome");
	}
}
