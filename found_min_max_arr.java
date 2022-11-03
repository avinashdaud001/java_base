package recursion;

public class found_min_max_arr {
    static int sea(int arr[], int n) {
        if (n == 1){
            return arr[0];
    }

        return Math.min(arr[n-1], sea(arr, n-1));



    }
    public static void main(String[] args) {
        int arr[]={1, 4, 3, -5, -4, 8, 6};
        int n=arr.length;
        int v=sea(arr,n);
        System.out.println(v);
    }
}
