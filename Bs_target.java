package Practice;

public class Bs_target {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int target=5;
        System.out.println(sort(arr,target));
    }
    static int sort(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
