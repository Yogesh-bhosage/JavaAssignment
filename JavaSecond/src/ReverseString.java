public class ReverseString {
	static String  makeReverse(String str) {
		String s[]=str.split(" ");
		String revword="";
		for(String a:s) {
			for(int i=a.length()-1;i>=0;i--) {
				revword+=a.charAt(i);
				//System.out.println(a.charAt(i)));
			}
			revword+=" ";
		}
		return revword;
	}
	
	public static void main(String args[]) {
		System.out.println(makeReverse("Yogesh Bhosage"));
	}

}
