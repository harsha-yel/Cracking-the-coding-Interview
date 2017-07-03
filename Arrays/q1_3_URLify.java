
public class q1_3_URLify{
	// Assume string has sufficient free space at the end
	public static void replaceSpaces(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}
		index = trueLength + spaceCount * 2;
		System.out.println(String.valueOf(str));

		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	} 
	
	public static void main(String[] args) {
		String str = "Mr John Smith    ";
		char[] ch = str.toCharArray();
		int trueLength = str.trim().length();
		replaceSpaces(ch, trueLength);	
		System.out.println("\"" + String.valueOf(ch) + "\"");
	}
}
