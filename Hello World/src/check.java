
public class check {
public static void eat()
{
System.out.println("hh");	
}
public void run()
{
System.out.println("ff");
}
public static void main(String args[])
{
	System.out.println("gg");	
	check c=new check();
	Boom b=new Boom();
	b.runw();
	c.run();
	check.eat();
}
}
class Boom
{
public void runw()
{
	System.out.println("fg");
}
}