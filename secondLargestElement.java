public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr= {20, 40, 23, 12, 43, 54, 90, 78, 76};

        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(arr[i]>mx){
                mx = arr[i];
            }
        }
        System.out.println(mx);

        int second_mx = Integer.MIN_VALUE;
        for(int i = 0; i<n ;i++){
            if(arr[i]>second_mx && arr[i] != mx){
                second_mx = arr[i];
            }
        }
        System.out.println(second_mx);
    }
}
