package lab_5;

public class Task1_4 {
	// tranpose a matrix
		public static int[][] transpose(int[][] a) {
			int rows =a.length;
			int cols = a[0].length;
			// TODO
			int result[][] = new int [cols][rows];

			for(int i =0;i<a.length;i++) {
				for(int j =0; j<a[0].length;j++) {
					result[j][i] = a[i][j];
				}
			}
			return result;
		}
		static void printMatrix(int[][] array) {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");

				}
				System.out.println();
			}
		}
		public static void main(String[] args) {
			int[][] arrrr1 = {
					{1,2},
					{3,4},
					{5,6}
					};
			printMatrix(transpose(arrrr1));
			}

}
