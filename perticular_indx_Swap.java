import java.util.Arrays;

public class perticular_indx_Swap {
    static int[] swap(int arr[], int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    public static void main(String[] args) {
        int b[] = {1, 2, 3, 4, 5, 7};
        swap(b, 2, 4);
        System.out.println(Arrays.toString(b));
    }

}