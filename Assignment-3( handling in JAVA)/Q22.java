class  CustomCheckedException extends Exception{
	 CustomCheckedException(String msg){
		 super(msg);
	 }
}
public class Q22 {

	public static void main(String[] args) {
		  int[][] matrix1 = {{1, 2}, {3, 4},{2,3}};
	      int[][] matrix2 = {{5, 6}, {7, 8}};

		
		try {
			 int[][] result =addmat(matrix1, matrix2);
	            System.out.println("Result of matrix addition:");
	            printMatrix(result);
		}
		catch(CustomCheckedException e) {
			System.out.println("CustomCheckedException caught: " + e.getMessage());
		}
	}
	public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
	 public static int[][] addmat(int[][] mat1, int[][] mat2) throws CustomCheckedException {
	        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
	            throw new CustomCheckedException("Matrices must have the same dimensions for addition");
	        }
	        int rows = mat1.length;
	        int cols = mat1[0].length;
	        int[][] result = new int[rows][cols];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                result[i][j] = mat1[i][j] + mat2[i][j];
	            }
	        }
	        return result;
	    }
}
