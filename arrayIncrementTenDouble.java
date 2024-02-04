public class arrayIncrementTenDouble {
    public static void main(String[] args) {
        int[] arr = {23,67,34,21,56,90,67,84,35,29,40};
        int n = arr.length;

        for(int i =0; i < n; i++){
            if(i%2 == 0){
                arr[i]+=10;
            }
            else{
                arr[i]*=2;
            }
        }
        System.out.println("Array after modifications:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
