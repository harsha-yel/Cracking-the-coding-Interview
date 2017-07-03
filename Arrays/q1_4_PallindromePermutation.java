//Time complexity: O(n)
//Checks for even occcurences of each character and one odd occurence for the middle element
//in case of odd length string
public class q1_4_PallindromePermutation{
	public static boolean check(String str){
		int ch[]=new int[26];
		int len=0;int count=0;
		for(int i=0;i<str.length();i++)
		if(str.charAt(i)!=' ')
			ch[Character.toLowerCase(str.charAt(i))-'a']++;
		
		for(int i=0;i<26;i++)
		{
			if(ch[i]%2!=0)
				count++;
			if(count>1)
				return false;
		}
		return true;
	}


	public static void main(String[] args) {
		String str[]={"Tact Coa","Haha"};
		for(String word:str)
			System.out.println(word+" :"+check(word)); 
	}
	
}