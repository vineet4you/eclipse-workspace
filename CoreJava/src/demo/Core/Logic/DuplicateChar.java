package demo.Core.Logic;

import java.util.HashSet;
import java.util.Set;

public class DuplicateChar {

	public static void main(String[] args) {
		String test="abbccdee";
		Set<Character> s=new HashSet<Character>();
		Set<Character> s1=new HashSet<Character>();

		int l=test.length();
		char c;
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<l;i++)
		{
			c=test.charAt(i);
			//s.add(c);
			if(!s.contains(c))
				{s.add(c);
			//sb.append(c);
				}
			else {
				s1.add(c);
			}	
			}System.out.println(s1);
		/*Iterator<Character> it=s.iterator();
		while(it.hasNext())*/
	//s.forEach(i ->System.out.println(i));	
		//System.out.println(sb);
		//for(char ch:s)
			//System.out.println(sb);
	}

}
