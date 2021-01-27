
public class PrintPrime {

	public static void print(int n) {
		int flag=0;
		for(int i=3;i<=n;i++) {
			flag=0;
			for(int j=2;j<=(i/2);j++){   
			    if(i%j==0){          
			     flag=1;      
			     break;      
			    }      
			   }
			if(flag==0)
				  System.out.println(i);
			  }
			  
		}
		
	
	
	public static void main(String args[]) {
		print(25);

	}
}
