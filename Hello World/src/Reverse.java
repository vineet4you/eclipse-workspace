
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="vineet";
		int l=s.length();
		String r="";
		char c;
		for(int i=l;i>1;i--)
		{
			c=s.charAt(i);
			r=r+c;}
		System.out.println(r);
	}

}
