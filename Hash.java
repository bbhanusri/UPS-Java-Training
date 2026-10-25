import java.util.HashSet;

class Hash {
    public static void main(String[] args) {

        int arr[] = {10, 20, 10, 30, 20, 40, 50, 30};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println("Unique values: " + set);

        System.out.println("Number of unique elements: " + set.size());

        if (set.contains(40)) {
            System.out.println("40 is present in the set");
        } else {
            System.out.println("40 is not present in the set");
        }
    }
}