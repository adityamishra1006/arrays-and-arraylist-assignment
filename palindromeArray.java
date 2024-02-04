public class palindromeArray {
    public static void main(String[] args) {

        int arr1[] = {1,0,0,1};
        int arr2[] = {3,5,2,6,8};

        System.out.println(isPalindrome(arr1));
        System.out.println(isPalindrome(arr2));
        
    }
    static boolean isPalindrome(int[] arr){
        int i = 0; 
        int j = arr.length -1;
        while(i<j){
            if(arr[i] != arr[j]){
                return false;
            }
           i++;
           j--;
        }
        return true;
    }
}
