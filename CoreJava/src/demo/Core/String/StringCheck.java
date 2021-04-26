package demo.Core.String;

import java.util.ArrayList;
import java.util.List;

public class StringCheck {

	public static void main(String[] args) {
	/*	String str= "Aviral";
		String s;
		s=str.substring(3, 7);
		System.out.println(s); */
		
		List<String> sList=new ArrayList();
	
		sList.add("");
		for(String s:sList)
		{
			System.out.println(s.length());
			}
	}

}
