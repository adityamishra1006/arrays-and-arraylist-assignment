public class threeSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n = arr.length;

        int x = 15;
        int result = countTripletSum(arr, x);
        System.out.println("Triplets that sum to " + x +" is "+ result);
    }

    
    static int countTripletSum(int[] arr, int x){

        int n=arr.length;
        int count =0;

        

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1;j++){
                for(int k =j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == x){
                        // System.out.println(arr[i] + arr[j] + arr[k]);
                        count++;
                    }
                }
            }
        }

        return count;
    }
}
