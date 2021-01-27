
public class Interest {

	static double calInterest(int amt) {
		if(amt<=1000) {
			return (amt*0.04);
		}
		else if(amt<=5000) {
			return amt*0.045;
		}
		else
		return amt*0.05;
	}
	public static void main(String args[]) {
		System.out.println(calInterest(900));
		System.out.println(calInterest(4500));
		System.out.print(calInterest(6600));
		
	}

}
