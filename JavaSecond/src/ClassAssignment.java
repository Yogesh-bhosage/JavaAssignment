
public class ClassAssignment {
	
	public static void addMatrix() {
		int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
		int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
	    
		int c[][]=new int[3][3];      
		for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
						c[i][j]=a[i][j]+b[i][j];    //use - for subtraction  
						System.out.print(c[i][j]+" ");    
					}
			}
		}
	public static void multiplyMatrix() {
		int a[][]={{5,2,7},{22,52,82},{31,43,86}};    
		int b[][]={{2,4,8},{5,34,23},{32,53,34}};    
	    int c[][]=new int[3][3];     
		for(int i=0;i<3;i++){    
				for(int j=0;j<3;j++){    
					c[i][j]=0;      
					for(int k=0;k<3;k++)      
					{      
						c[i][j]+=a[i][k]*b[k][j];      
					}
					System.out.print(c[i][j]+" ");  
				} 
				System.out.println();
			}
		}
	
	public static void transposeMatrix() {
		int matricx[][]={{1,3,4},{2,4,3},{3,4,5}};     
		int transMatrix[][]=new int[3][3];   
		    
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			transMatrix[i][j]=matricx[j][i];  
			}    
			}     
			for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
			System.out.print(transMatrix[i][j]+" ");    
			}    
			System.out.println();//new line    
			}  
	}
	public static void main(String args[]) {
		addMatrix();
		multiplyMatrix();
		transposeMatrix();
	}
}
