class diffOfSumOfOddEvenElement{
    public static void main(String[] args) {
        int[] arr = {23,67,34,21,56,90,67,84,35,29,40};
        int n = arr.length;

        int evenSum = 0;
        int oddSum = 0;

        for(int i=0; i<n;i++){
            if(i%2==0) evenSum += arr[i];
            else oddSum +=arr[i];            
        }

        System.out.println(Math.abs(evenSum - oddSum));
    }
}