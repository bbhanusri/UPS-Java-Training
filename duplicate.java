public class duplicate {
    public static void main(String[]args){
        int arr[] = {4,2,7,4,8,2,9,4};
        for(int i=0; i<arr.length;i++){
            boolean found = false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    found= true;
                    break;
                }
            }
            if(!found){
                for(int j= i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        System.out.println(arr[i]+" ");
                        break;
                    }
                }
            }

        }
    }
    
}
