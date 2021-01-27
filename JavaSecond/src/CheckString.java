
public class CheckString {
	
	static int check(String sentence,String word){ 
		String args[]=sentence.split(" ");
		int c=0;
		for(String i:args) {
			if(i.equals(word))
				c++;
			
		}
		return c;
	}
	public static void main(String args[]) {
		System.out.println(check("hello Yogesh hello hello", "hello"));
		
	}

}
