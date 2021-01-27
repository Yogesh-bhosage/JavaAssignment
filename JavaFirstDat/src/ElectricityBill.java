
public class ElectricityBill {
//n=1 for domestic
//n==2 for commercial
	public static double calculateBill(int n,int u) {
		double bill;
		if(n==1) {
			if(u<=100) {
				bill=u*4;
				if(bill<250)
					bill=250;
			}
			else if(u>=100&&u<=300) {
				bill=u*4.5;
			}
			else if(u>=300&&u<=500)
				bill=u*4.75;
			else 
				bill=u*5;
		}
		else {
			if(u<=100) {
				bill=u*4.25;
				if(bill<350)
					bill=350;
			}
			else if(u>=100&&u<=300) {
				bill=u*4.75;
			}
			else if(u>=300&&u<=500)
				bill=u*5;
			else 
				bill=u*5.25;
			
		}
		return bill;
		
	}
	
	
	

	public static void main(String args[]) {
	System.out.println(calculateBill(1,70));
	System.out.println(calculateBill(2,170));

	}

}
