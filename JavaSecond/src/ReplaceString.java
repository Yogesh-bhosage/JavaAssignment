
public class ReplaceString {
	
	public static String replace(String str,String word,String replString) {
		String replace="";
		for(String a:str.split(" ")) {
			if(word.equals(a)){
				replace+=replString;
			}
			else {
				replace+=a;
			}
			replace+=" ";
			
		}
		
		return replace;
	}
	
	public static void main(String args[]) {
		System.out.println(replace("hello Yogesh Bhosage", "Yogesh", "Shiva"));
	}

}
