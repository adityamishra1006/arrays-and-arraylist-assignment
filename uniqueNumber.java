// It do not considering all the test cases
public class uniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 5, 6, 6, 5,4,7};
        int n =  arr.length; 

        int unique = findUnique(arr);
        System.out.println(unique);
    }

    private static int findUnique(int[] arr) {
        int uniqueInteger = 0 ;

        for(int i=0; i<arr.length; i++){
            uniqueInteger = uniqueInteger^arr[i];
        }
        return uniqueInteger;
    }
}
