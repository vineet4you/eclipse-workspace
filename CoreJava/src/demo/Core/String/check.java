package demo.Core.String;

public class check {

	public static void main(String[] args)
	{
		check2 c2=new check2();
		//c2.show();
		c2.show();
		
	}
}
class check1
{
static void show()
{
	System.out.println("parent class show");
	}
}
class check2 extends check1
{
static void show()
{
System.out.println("child class");	
}
void dontshow()
{
System.out.println("child class dont show");	
}
}