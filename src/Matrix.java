import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int[][] mat = inputMatrix();

		int sum = 0;
		for (int i = 0; i < mat.length; i++) {
			sum += mat[i][i];
		}
		System.out.println("\nSum of elements of main diagonal: " + sum);
	}

	public static int[][] inputMatrix() {
		Scanner input = new Scanner(System.in);
		int size;
		System.out.println("-----Find sum of main diagonal of a square matrix-----");
		do {
			System.out.print("Enter size of square matrix: ");
			size = input.nextInt();
		} while (size <= 0);

		int[][] mat = new int[size][size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter numbers in row " + i + ": ");
			for (int j = 0; j < size; j++) {
				System.out.print("    Enter number at column " + j + ": ");
				mat[i][j] = input.nextInt();
			}
		}
		return mat;
	}
}
