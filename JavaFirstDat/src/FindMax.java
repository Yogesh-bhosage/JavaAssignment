
public class FindMax {
	static int calMax(int x,int y,int z) {
		if(x>y&&x>z)
			return x;
		else if(y>x&&y>z)
			return y;
		else
		return z;
	}
	public static void main(String args[]) {
		System.out.print(calMax(23,56,43));
	}

}
