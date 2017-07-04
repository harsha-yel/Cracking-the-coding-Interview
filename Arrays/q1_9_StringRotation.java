public class q1_9_StringRotation{
	static boolean isSubString(String s1,String s2){
		if(s1.contains(s2))
			return true;
		return false;
	}
	static boolean rotateString(String s1,String s2){
		if(s1.length()==s2.length()){
			s1=s1+s1;
			return isSubString(s1,s2);
		}
		else 
			return false;
	}
	public static void main(String[] args) {
			String s1[]={"harsha","harsha"};
			String s2[]={"arshah","har"};
			
			for(int i=0;i<s1.length;i++){
				System.out.println(s1[i]+","+s2[i]+":"+rotateString(s1[i],s2[i]));
			}
	}
}