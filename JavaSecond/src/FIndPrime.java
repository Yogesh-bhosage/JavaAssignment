import java.util.ArrayList;

public class FIndPrime {
	
	public static ArrayList<Integer> findPrime(int[] b){
		ArrayList<Integer> a = new ArrayList<>();
		for(int i:b) {
			int flag=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				a.add(i);
			}
			
		}
		return a;
	}

	public static void main(String[] args) {
		int a[]= {2,4,5,9,13,56};
		System.out.println(findPrime(a));
	}

}
