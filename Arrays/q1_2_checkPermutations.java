// Time complexity: O(n) 
import java.util.*;
public class q1_2_checkPermutations{
	static boolean checkPermutations(String a,String b){
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		//Pushing the characters and the number of occurences into the hashmap
		for(int i=0;i<a.length();i++){
			if(map.get(a.charAt(i))==null)
				map.put(a.charAt(i),1);
			else{
				int count=map.get(a.charAt(i));
				map.put(a.charAt(i),count+1);
			}
		}
		//Decrementing the value of corresponding letter of string a from string b
		for(int i=0;i<b.length();i++){
			if(map.get(b.charAt(i))==null)
				return false;
			else{
				int count=map.get(b.charAt(i));
				map.put(b.charAt(i),count-1);
			}
		}
		//Traversing through the hashmap
		for(Map.Entry m:map.entrySet())
			if((int)m.getValue()>0)
				return false;
		return true;
	}
	public static void main(String[] args) {
		String a="abc";
		String b="dbca";
		System.out.println(checkPermutations(a,b));

	}
}