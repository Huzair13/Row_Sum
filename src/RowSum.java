import java.util.Scanner;

public class RowSum{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows in the array");
        int sizeRow=scanner.nextInt();

        System.out.println("Enter the number of columns in the array");
        int sizeColumn=scanner.nextInt();

        int array[][]=new int[sizeRow][sizeColumn];

        System.out.println("Enter the array elements");
        for(int iterator=0;iterator<sizeRow;iterator++){
            for(int j=0;j<sizeColumn;j++){
                array[iterator][j]=scanner.nextInt();
            }
        }

        int rowSumArray[]=rowSum(array,sizeRow,sizeColumn);
        System.out.println("Row Sum is :");

        for(int i: rowSumArray){
            System.out.print(i+" ");
        }

    }

    private static int[] rowSum(int[][] array, int sizeRow, int sizeColumn) {
        int rowSumArray[]=new int[sizeRow];
        for(int i=0;i<sizeRow;i++){
            int rowSum=0;
            for(int j=0;j<sizeColumn;j++){
                rowSum+=array[i][j];
            }
            rowSumArray[i]=rowSum;
        }
        return rowSumArray;
    }
}