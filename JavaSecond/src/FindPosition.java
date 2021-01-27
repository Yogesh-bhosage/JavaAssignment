
public class FindPosition {
	static int findPosition(int num,int[] nos) {
		int c=1;
		for(int i:nos) {
			if(i==num) {
				return c;
			}
			c++;
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int n[]= {2,4,6,9,3};
		System.out.println(findPosition(3, n));
	}

}
