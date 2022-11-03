package Searching.BinarySearch;

public class binarySearch {
    static int Search(int arr[],int t) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t>arr[mid]){
                end=mid-1;
            }
          else if (t<arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        int arr[]={12,13,14,15,16,17,18,19};
        int arr[]={19,15,14,12,13};
        int target=15;

        System.out.println(Search(arr,target));
    }
}
