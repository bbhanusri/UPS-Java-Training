class Solution{
   public static void main(String[]args){
     int arr[]= { 20,30,40,50,70,80,90};
     int min = arr[0];
     int max = arr[0];
  for(int i=0;i<arr.length;i++){
    if(arr[i] < min ){
       min = arr[i];
     }
    if(arr[i] > max){
      max = arr[i];
    }
 }
     int secondMax = Integer.MIN_VALUE;
     int secondMin = Integer.MAX_VALUE;
    for(int i=0; i<arr.length; i++){
    if (arr[i] > min && arr[i] < secondMin) {
                secondMin = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
   System.out.println("Minimum: "+ min);
   System.out.println("Maximum: "+ max);
   System.out.println("Second Minimum: "+ secondMin);
   System.out.println("Second Maximum: "+ secondMax);       
   }
}




































