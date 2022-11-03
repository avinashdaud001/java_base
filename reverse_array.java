import java.util.Arrays;

public class reverse_array {
    static int[] reverse(int []b){
        int start=0;
        int end=b.length-1;
        while(start<end){
            int swap=b[start];
            b[start]=b[end];
            b[end]=swap;

            start++;
            end--;
        }
        return b;

    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverse(a)));

    }
}
