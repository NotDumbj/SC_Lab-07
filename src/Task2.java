import java.util.Scanner;

public class Task2 {

    public static class Matrix{
        public int row;
        public int col;
        public int[][] matrix;
        public Matrix(int row, int col){
            this.row = row;
            this.col = col;
            matrix = new int[row][col];
        }
        public void setMatrix(int[][] m){
            matrix = m;
        }

        public void printMatrix(){
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    System.out.print(matrix[i][j] + "  ");
                }
                System.out.println();
            }
        }
    }

    public static Matrix takeMatrixInput(int r, int c){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the data:");
        int[][] matrix = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        Matrix m = new Matrix(r,c);
        m.setMatrix(matrix);
        return m;
    };

    public static Matrix multiplyMatrix(Matrix m1, Matrix m2) {
        int r1 = m1.row;
        int c1 = m1.col;
        int r2 = m2.row;
        int c2 = m2.col;

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible (c1 != r2).");
            return null;
        }

        Matrix result = new Matrix(r1, c2);

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                result.matrix[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    result.matrix[i][j] += m1.matrix[i][k] * m2.matrix[k][j];
                }
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and column for Matrix 1: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        Matrix matrix1 = takeMatrixInput(r1, c1);

        System.out.println("Enter rows and column for Matrix 2: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        Matrix matrix2 = takeMatrixInput(r2, c2);

        sc.close();

        Matrix result = multiplyMatrix(matrix1, matrix2);

        if (result != null) {
            System.out.println("Resultant Matrix:");
            result.printMatrix();
        }
        else {
            System.out.println("Matrix Multiplication is not possible.");
        }
    }
}
