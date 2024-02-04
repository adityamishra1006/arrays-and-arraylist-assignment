public class countElementGreaterX {
    public static void main(String[] args) {
        int[] arr= {20, 40, 23, 12, 43, 54, 90, 78, 76};
        int x = 40;
        int n = arr.length;

        for(int i = 0; i<n; i++){
            if (arr[i] > x){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
