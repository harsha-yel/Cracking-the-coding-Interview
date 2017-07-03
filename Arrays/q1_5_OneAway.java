public class q1_5_OneAway{
	static boolean check(String a,String b){
		int ch[]=new int[26];

		for(int i=0;i<a.length();i++)
			ch[Character.toLowerCase(a.charAt(i))-'a']++;
		
		for(int i=0;i<b.length();i++)
			ch[Character.toLowerCase(b.charAt(i))-'a']--;
		
		int ndiff=0;
		for(int i=0;i<26;i++)
			if(ch[i]!=0) ndiff++;

		if(a.length()==b.length()) 
		{	
			if(ndiff>2)
				return false;
		}else
			if(ndiff>1)
				return false;
		return true;
}

	public static void main(String[] args) {
		String a[]={"pale","pales","pale","pale"};
		String b[]={"ple","pale","bale","bake"};
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+","+b[i]+":"+check(a[i],b[i]));
	}
}