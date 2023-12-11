package lab_5;

public class Task1_1 {
	// add 2 matrices
		public static int[][] add(int[][] a, int[][] b) {
			int rows = a.length;
	        int cols = a[0].length;
	        int[][] result = new int[rows][cols];
			for(int row =0 ;row < a.length;row++) {
				for(int col =0 ; col <b.length;col++) {
				result[row][col]= a[row][col] + b[row][col];
				}
			}

			return result;
			}

		static void printMatrix(int[][] array) {
			for(int i =0;i<array.length;i++) {
				for(int j=0;j<array[i].length;j++	) {
					System.out.print(array[i][j] +" ");

				System.out.println();
				}
			}
		}
		public static void main(String[] args) {
			int[][] a11 = {
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
			int[][] a22 = {
					{0,0,0},
					{0,0,0},
					{0,0,0}

			};

			printMatrix(add(a11, a22));
		}

}
