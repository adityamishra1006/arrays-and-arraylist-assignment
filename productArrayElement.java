public class productArrayElement{
    public static void main(String[] args) {
        int[] arr = {14, 23, 45, 21, 65, 90, 10};

        int product = 1;

        for(int i=0; i<arr.length; i++){
            product*=arr[i];
        }
        System.out.println(product);
    }
}