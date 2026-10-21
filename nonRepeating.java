public class nonRepeating {
    public static void main (String[]args){
        String s = "swiss";
        boolean found = false;
        for(int i=0; i<s.length();i++){
            int count = 0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(s.charAt(i));
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("There are no non repeating characters");
        }

    }
}

