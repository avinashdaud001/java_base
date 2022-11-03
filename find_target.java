public class find_target {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int target=3;
        System.out.println(find(arr,target,0));
    }

    private static int find(int[] arr, int target, int i) {
        if(i==arr.length){
            return -1;
        }
        if(target==arr[i]){
            return i;
        }
        else{
            return find(arr,target,i+1);
        }
    }
}
