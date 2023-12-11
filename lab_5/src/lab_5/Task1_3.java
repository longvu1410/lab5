package lab_5;

public class Task1_3 {
	static void printMatrix(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}
	}
	// multiply 2 matrices
	public static int[][] multiply(int[][] a, int[][] b) {
		// TODO
		int rowa = a.length;
		int cola = a[0].length;
		int rowb = b.length;
		int colb = b[0].length;



		if(cola != rowb) {
			System.out.println(
	                "\nMultiplication Not Possible");
			return null;

		}
		int result[][] = new int [rowa][colb];
		for(int i =0;i<rowa;i++	) {
			for(int j=0;j<colb;j++	) {
				for(int k =0 ;k <rowb;k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		return result;
	}
	public static void main(String[] args) {
		int[][] arr1 = {
				{2,3,4},
				{2,3,4},
		};
		int[][] arr2 = {
				{2,3,4,5},
				{2,3,4,5},
				{2,3,4,5},
		};
		printMatrix(multiply(arr1, arr2));
	}

}
