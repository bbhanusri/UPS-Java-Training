import java.util.Scanner;
class D{
    public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
      System.out.print("Enter a Number:");
       int num = sc.nextInt();
       int remainder = num%2;
       while(remainder==0){
         System.out.println("Even");
       break;
     }
     while(remainder!=0){
       System.out.println("Odd");
     break;
     }
   sc.close();
   }
}































