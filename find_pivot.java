package Searching.BinarySearch;

public class find_pivot {
    static int pivot(int arr[]){
        int start=0;
        int end=1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }

            else{
                start=mid+1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={5,1,2,8};
        System.out.println(pivot(arr));
    }
}
