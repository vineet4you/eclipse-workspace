package demo.Core.Logic;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1;
		int c=0;
		System.out.println(a);
		while(c<=10)
		{
			c=a+b;
			a=b;
			b=c;
			c=a;
			System.out.println(c);
		}
	}

}
