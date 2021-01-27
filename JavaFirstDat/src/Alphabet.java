
public class Alphabet {
	
	static boolean checkAlpha(char alph) {
		if(alph=='a'||alph=='e'||alph=='i'||alph=='o'||alph=='u')
			return true;
		else 
			return false;
		
	}

	
	public static void main(String args[]) {
		System.out.println(checkAlpha('c'));
		System.out.println(checkAlpha('a'));

	}

}
