public class q1_6_StringCompression{
	static String compress(String str){
		String out="";
		int count=0;
		for(int i=0;i<str.length()-1;i++){
			if(str.charAt(i)!=str.charAt(i+1))
			{
				out=out+str.charAt(i)+(count+1);
				count=0;
			}
			else count++;
		}
		out=out+str.charAt(str.length()-1)+(count+1);
		return str.length()>out.length()? out:str;
	}

	public static void main(String[] args) {
		String str[]={"aabcccccaaa","abcd","aabccbbdd"};
		for(String word:str)
			System.out.println(word+":"+compress(word));
	}
}