package demo.Core;

import java.util.ArrayList;
import java.util.Iterator;

class StaticDemo {

	Pojo p1=new Pojo("Vineet", "Sharma");
	Pojo p2=new Pojo("Banke", "Bhatia");
	Pojo p3=new Pojo("Akash", "Keshwani");
	ArrayList<Pojo> list=new ArrayList<Pojo>();
	
	public void iterate()
	{
		list.add(p1);
		list.add(p2);
		list.add(p3);
		//list.forEach(i->System.out.println(i));
		Iterator<Pojo> it=list.iterator();
		while(it.hasNext())
		{
			Pojo p4=it.next();
			System.out.println(p4.name);
			System.out.println(p4.surname);

		}
	}
	
	
	/*
	 * String[] array= {"Vineet" , "Sumit" , "Banke"}; List<String>
	 * list=Arrays.asList(array); public void lambdaDisplay() {
	 * 
	 * //System.out.println(list); list.forEach(i -> System.out.println(i)); }
	 * public void iteratorDisplay() { Iterator<String> it=list.iterator();
	 * while(it.hasNext()) { System.out.println(it.next()); } }
	 */
	
	public static void main(String[] args) {
	StaticDemo st=new StaticDemo();
	st.iterate();
	//st.lambdaDisplay();
	//st.iteratorDisplay();

	}

}

