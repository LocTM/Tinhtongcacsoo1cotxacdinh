import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int [][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        displayMatrix(matrix);
//
//
//        System.out.println("Nhập cột cần tính tổng: ");
//        int columnIndex = scanner.nextInt();
//
//        int columnSum = getColumnSum(matrix, columnIndex);
//
//        System.out.println("Tổng của cột " + columnIndex + " là: " + columnSum);
//    }
//
//    private static void displayMatrix(int[][] matrix) {
//        for (int[] row : matrix) {
//            for (int value : row) {
//                System.out.print(value + "\t");
//            }
//            System.out.println();
//        }
//    }
//    private static int getColumnSum(int[][] matrix, int columnIndex) {
//        int columnSum = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            columnSum += matrix[i][columnIndex];
//        }
//        return columnSum;
        System.out.print("Nhập số hàng của mảng: ");
        int numRows = scanner.nextInt();
        System.out.print("Nhập số cột của mảng: ");
        int numCols = scanner.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print("Nhập giá trị cho phần tử ở hàng " + (i + 1) + ", cột " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        displayMatrix(matrix);
    }

    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}



