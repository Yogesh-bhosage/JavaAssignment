
public class IncomeTax {
	static double calTax(int gp) {
		if(gp<=240)
		return Double.valueOf(gp);
		else if(gp>=241&&gp<=480)
			return gp*0.15;
		else 
			return gp*0.28;
		
	}
	
	public static void main(String args[]) {
		System.out.print(calTax(23));
	}



}
