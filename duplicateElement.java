public class duplicateElement {
    public static void main(String[] args) {
        int[] arr = {14, 23, 45, 21, 45, 21, 65, 90, 10};
        int n = arr.length;

        for(int i =0; i<n; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    System.out.println("Duplicate element is : " + arr[j]);
                }
            }
        }
    }
}
