public class Q21 {
    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] mat2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix 1:");
        printMatrix(mat1);
        System.out.println("Matrix 2:");
        printMatrix(mat2);
        
        try {
            int[][] addresult = addMatrices(mat1, mat2);
            System.out.println("Result of matrix addition:");
            printMatrix(addresult);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Matrix addition error: " + e.getMessage());
        }
    
        try {
            int[][] mul_result = mul_matrices(mat1,3,3 ,mat2,3,3);
            System.out.println("Result of matrix multiplication:");
            printMatrix(mul_result);
        } catch (IllegalArgumentException e) {
            System.out.println("Matrix multiplication error: " + e.getMessage());
        }
        //handling for the transpose purpose
        System.out.println("Transpose of matrix 2:");
         transposeMatrix(mat2);
        printMatrix(mat2);
    }

    public static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            throw new IllegalArgumentException("Matrices required same dimensions for addition");
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

public static int[][] mul_matrices(int[][] mat1,int r1,int r2 ,int[][] mat2,int c1,int c2) {
    if (c1!=c2) {
        throw new IllegalArgumentException("Number of columns in the first matrix must be equal to the number of rows in the second matrix for multiplication");
    }
    int[][] result = new int[r1][c2];
    for (int i = 0; i < r1; i++) {
        for (int j = 0; j < c2; j++) {
            for (int k = 0; k < r2; k++) {
                result[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }
    return result;
}

public static void transposeMatrix(int[][] mat) {
    for (int i = 0; i < mat.length; i++) {
        for (int j = i; j < mat.length; j++) {
            int temp=mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
    }
}
    public static void printMatrix(int[][] mat) {
        for (int i=0;i<mat.length;i++) {
            for (int j=0;j<mat[i].length;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}