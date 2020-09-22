
public class Matrix {

	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] m2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printMatrix(m1);
		printMatrix(m2);

		int[][] m3 = AddMatrix(m1, m2);
		printMatrix(m3);

		int[][] m4 = multiplyMatrix(m1, m2);
		printMatrix(m4);

	}

	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int[][] AddMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = matrix1[i][j] + matrix2[i][j]; 
			}
		}

		return c;
	}

	public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
		int[][] c = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}
		return c;
	}
}
