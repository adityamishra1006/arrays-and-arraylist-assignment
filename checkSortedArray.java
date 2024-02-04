public class checkSortedArray {

    public static boolean isSorted(int[] arr){
        int n = arr.length;
        
        for(int i= 1; i<n; i++){
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        int arr[] = {23,65,74,94, 34, 108};
        int arr2[]  = {1,2,3,4,5};

        System.out.println(isSorted (arr)); 
        System.out.println(isSorted (arr2));
    }
}
