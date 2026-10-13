class Addition{
int add(int a,int b){
return a+b;
}
int add(int a, int b, int c){
return a+b+c;
}
double add(double a, double b){
return a+b;
}
}
class Main{
public static void main(String[]args){
Addition obj = new Addition();
System.out.println(obj.add(100,121));
System.out.println(obj.add(100,121,789));
System.out.println(obj.add(1010.56,121.78));
}}













































