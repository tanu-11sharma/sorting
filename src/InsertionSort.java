public class InsertionSort {
    static void insertion_sort(int[] arr , int n){
        for(int i = 0; i<=n-1; i++) {
            int j = i;
            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j] ;
                arr[j] = temp;
                j--;
            }
        }
        System.out.println("After  insertion sort");
        for(int i = 0; i<n;i++){
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = { 13 , 26 , 9 , 45 , 76 , 2};
        int n = arr.length;
        System.out.println("before sorting");
        for(int i = 0 ;i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
    }
}
