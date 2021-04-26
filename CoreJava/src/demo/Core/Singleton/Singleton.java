package demo.Core.Singleton;

class Singleton {

	private static Singleton s=new Singleton();
	
	
	private Singleton()
	{
	}
	public static Singleton getInstance()
	{
		return s;
	}
	public void showMsg()
	{
		System.out.println("This is a singleton design pattern");
	}
}
class test
{
	public static void main(String[] args)
	{
		Singleton t=Singleton.getInstance();
		t.showMsg();
	}
}