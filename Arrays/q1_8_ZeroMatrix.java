import java.util.*;
public class q1_8_ZeroMatrix{
	
	static void randomMatrix(int matrix[][]){
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				matrix[i][j]=(int)(Math.random()*10);			
	}

	static void displayMatrix(int matrix[][]){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.print("\n");
		}
	}

	static void setZeroes(int matrix[][]){
		int buf[]=new int[matrix[0].length];
		//save the column index to set that columnto 0
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				if(matrix[i][j]==0)
					buf[j]++;
		
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[i].length;j++)
				{
				if(matrix[i][j]==0)
					Arrays.fill(matrix[i],0);
				if(buf[j]!=0)
					matrix[i][j]=0;
				}
	}
	public static void main(String[] args) {
		int matrix[][]=new int[5][4];
		randomMatrix(matrix);
		System.out.println("Input");
		displayMatrix(matrix);	
		setZeroes(matrix);
		System.out.println("output:"+"\n");
		displayMatrix(matrix);

	}
}