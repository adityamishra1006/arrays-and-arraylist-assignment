public class mergeSortedArray {
    public static void main(String[] args) {
        int arr1[] = {12,23,34,45,56,67};
        int arr2[] = {21,32,43,54,65,76,87,98};

        int m=arr1.length;
        int n = arr2.length;

        int i=0, j=0, k=0;

        int[] result = new int[m+n];

        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                result[k++] = arr1[i++];
            }else{
                result[k++] = arr2[j++];
            }
        }
        while(i<m){
            result[k++]= arr1[i++];
        }
        while(j<m){
            result[k++] = arr2[j++];
        }

        for(int ele : result){
            System.out.print(ele + " ");
        }
    }
}
