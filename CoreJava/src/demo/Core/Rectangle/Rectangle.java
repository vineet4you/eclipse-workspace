package demo.Core.Rectangle;

public class Rectangle {

		void show() throws ArithmeticException
		{
			int a=0;
			int b=1;
			try {
			int c=b/a;
			System.out.println(c);}
			//System.out.println("print htis");
			/*catch(IndexOutOfBoundsException e)
			{System.out.println("this is not acceptable");}*/
			
			finally
			{System.out.println("checking if this is working or not");}
		}
	
	public static void main(String args[])
	{
	Rectangle r1=new Rectangle();
	r1.show();

}
}