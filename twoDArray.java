import java.util.Scanner;
    class twoDArray{
      public static void main(String[]args){
       Scanner sc = new Scanner(System.in);

         System.out.println("Enter Number of rows:");
         int rows = sc.nextInt();

         System.out.println("Enter Number of Columns:");
         int columns = sc.nextInt();

         int arr[][] = new int[rows] [columns];
         int sum = 0;

        System.out.println("Enter Array Elements:");
           for(int i=0; i<rows;i++){
             for(int j=0;j<columns;j++){
               arr[i][j]= sc.nextInt();
               sum = sum+ arr[i][j];
          }
      }
      System.out.println("The 2D Array is:");
         for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
          System.out.print(arr[i][j] + " ");
            }
         System.out.println();
        }
        System.out.println("Sum of Matrix Elements: "+   sum);
        sc.close();
    }
}


























































