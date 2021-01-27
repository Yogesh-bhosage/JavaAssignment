
public class CreditCard {
	static float calLoan(int age,char gender,String job,int asset) {
		double pb=0f;
		if(asset<=500)
		{
			pb=(asset/100)*0.25;
		}
		else
		{
			pb=(500/100)*0.25;
			asset=asset-500;
			if(asset<=1000)
			{
				pb=pb+(asset/100)*0.50;
			}
			else
			{
				pb=pb+(1000/100)*0.50;
				asset=asset-1000;
				
				if(asset<=1000)
				{
					pb=pb+(asset/100)*0.75;
				}
				else
				{
					pb=pb+(1000/100)*0.75;
					asset=asset-1000;
				
					if(asset>=1)
					{
						pb=pb+(asset/100)*1.0;
					}
				}
			}
		}
			
		System.out.println("Your Payback Amount is = "+pb);
		return (float)pb;
	}


	public static void main(String args[]) {
		
	System.out.println(calLoan(1,'M',"se",1400));
	
	}

}
