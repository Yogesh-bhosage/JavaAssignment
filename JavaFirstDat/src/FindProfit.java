
public class FindProfit {
	static float calculateProfit( int numAttendees) {
		float f=20f;
		f+=numAttendees*0.5;

		return numAttendees*5-f;
		
	}
	
	public static void main(String args[]) {
	System.out.println(	calculateProfit(70));
	}


}
