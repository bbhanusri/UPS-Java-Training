import java.util.Scanner;
class calculator{
static int add(int a , int b){
return a+b;
}
static int subtract (int a, int b){
return a - b;
}
static int multiply(int a, int b){
return a*b;
}
static int divide(int a , int b){
return a/b;
}
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st Number:");
int a = sc.nextInt();
System.out.println("Enter 2nd Number:");
int b= sc.nextInt();
System.out.println("Addition = " + add(a, b));
System.out.println("Subtraction = " + subtract(a, b));
System.out.println("Multiplication = " + multiply(a, b));
if(b!=0){
System.out.println("Division = "+ divide(a,b));
}else{
System.out.println("Cannot divide by zero");
}
sc.close();
  }
}
















































