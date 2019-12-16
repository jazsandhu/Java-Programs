/*Jasdeep Sandhu - 121190151*/
package Assignment2;

public class MatrixSymmetry {

	public static void main(String[] args) {
		int arrayA[][] = { { 1, 2, 3 }, { 4, 2, 7 }, { 9, 0, 7 } };
		int arrayB[][] = { { 1, 3, 5 }, { 3, 2, 1 }, { 5, 1, 7 } };
		Matrix A = new Matrix(3, 3, arrayA);
		Matrix B = new Matrix(3, 3, arrayB);
		
		System.out.println("The first Matrix is:");
		System.out.println(A.toString());
		System.out.println("The Second Matrix is:");
		System.out.println(B.toString());
		
		if(A.isSymmetric()) {
			System.out.println("A is a symmetric Matrix");
		}
		else {
			System.out.println("A is not a symmetric Matrix");
		}
		
		if(B.isSymmetric()) {
			System.out.println("B is a symmetric Matrix");
		}
		else {
			System.out.println("B is not a symmetric Matrix");
		}
	}

}

class Matrix {
	private int nrow;
	private int ncol;
	private int[][] mat;
	private int count = iterate;
	private static int iterate = 65;
	public final int N = 10;
	
	{
		iterate++;
	}

	Matrix() {
		nrow = 2;
		ncol = 2;
		mat = new int[nrow][ncol];
	}

	Matrix(int row, int col, int[][] array) {
		nrow = row;
		ncol = col;
		mat = array;
	}

	public Matrix(Matrix a) { 
		nrow = a.nrow;
		ncol = a.ncol;
		mat = a.mat;
	}

	public int getRow() {
		return nrow;
	}

	public void setRow(int value) {
		nrow = value;
	}

	public int getCol() {
		return ncol;
	}

	public void setCol(int value) {
		ncol = value;
	}

	public int[][] getMat() {
		return mat;
	}

	public void setMat(int[][] value) {
		mat = value;
	}
	
	public Matrix sum(Matrix m) {
		int[][] matArray = new int[nrow][ncol];
		Matrix n = new Matrix(getRow(), getCol(), matArray);
		if (getRow() == m.getRow() && getCol() == m.getCol()) {
			for (int i = 0; i < getRow(); i++) {
				for (int x = 0; x < getCol(); x++) {
					n.mat[i][x] = mat[i][x] + m.mat[i][x];
				}
			}
		} else {
			System.out.print("Error: Matrices dimensions are not the same!");
		}
		return n;
	}

	public boolean isSymmetric() {
		for (int i = 0; i < getRow(); i++) {
			for (int x = 0; x < getCol(); x++) {
				if (mat[i][x] != mat[x][i]) {
					return false;
				}
			}
		}
		return true;
	}

	public String toString() {
		char a = (char)count;
		String print = a + " =";
		for (int i = 0; i < getRow(); i++) {
			for (int x = 0; x < getCol(); x++) {
				print += "\t" + mat[i][x];
			}
			print += "\n";
		}
		return print;
	}
}