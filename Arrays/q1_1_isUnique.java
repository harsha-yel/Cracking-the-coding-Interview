import java.util.*;
public class q1_1_isUnique{

	static boolean isUnique(String str){
		int checker=0;
		for(int i=0;i<str.length();i++)
		{
			int val=str.charAt(i)-'a';	
			// To see the how the bit changes internally
			//System.out.print(val+" "+ (1<<val)+" "+(checker & (1 << val)));
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
			//System.out.println(" "+checker);
		}
		return true;
	}

	public static void main(String args[]){
			String str[]={"haba","hars"};
			for(String word:str)
				System.out.println(word+" "+isUnique(word));
	}
}