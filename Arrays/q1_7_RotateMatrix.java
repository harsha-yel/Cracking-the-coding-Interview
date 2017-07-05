public class q1_7_RotateMatrix{
	
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

	static void rotate(int matrix[][]){
		int n=matrix.length;
		
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
		//	System.out.println(first+" "+last);

			for(int i=first;i<last;i++){
				int offset=i-first;
				int top=matrix[first][i];
				matrix[first][i]=matrix[last-offset][first];
				matrix[last-offset][first]=matrix[last][last-offset];
				matrix[last][last - offset] = matrix[i][last]; 
				matrix[i][last] = top; // right <- saved top
		//		System.out.println(offset);
			}
		
		}	
	}

	public static void main(String[] args) {
		int matrix[][]=new int[5][5];
		randomMatrix(matrix);
		System.out.println("input matrix");
		displayMatrix(matrix);
		rotate(matrix);
		System.out.println("Rotated Matrix");
		displayMatrix(matrix);
	}
}

