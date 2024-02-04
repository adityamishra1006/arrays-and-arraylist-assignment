public class minimumValueElemetArray {
    public static void main(String[] args) {
        int[] arr = {14, 23, 45, 21, 65, 90, 10};
        int n = arr.length;

        int min = Integer.MAX_VALUE;
        for(int i =0; i<n ; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
