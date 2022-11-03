public class found_unique_arr {
    public static void main(String[] args) {
        int arr[]={2,4,2,3,4,6,3,6,8,8,9};
        int ans=found(arr);
        System.out.println(ans);
    }

    private static int found(int[] arr) {
        int unique=0;
        for (int n:arr){
            unique ^=n;
        }
        return unique;
    }
}
