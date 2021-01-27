
public class Prime {
	static boolean isPrimeNumber( int num) {
		
		 int i,m=0,flag=0;      
		  int n=num;    
		  m=n/2;      
		  if(n==0||n==1){  
		   return true;      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){          
		     flag=1;      
		     break;      
		    }      
		   }       
		  }
		  if(flag==0)
			  return true;
		  else {
			return false;
		}
		
	}
	public static void main(String args[]) {
		System.out.println(isPrimeNumber(25));
		System.out.print(isPrimeNumber(11));

	}


}
