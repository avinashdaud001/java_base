package Searching.BinarySearch;

public class without_use_length_search_target {
    static int findrange(int arr[],int target){
       int  start=0;
       int  end=1;
        while(target>arr[end]){
            int temp=end+1;

            end=(end-start+1)*2;// this formula give us double size of array
            start=temp;
        }
        return Search(arr,target,start,end);
    }
    static int Search(int arr[],int t,int start,int end) {

        while(start<=end){
            int mid=start+(end-start)/2;
            if(t<arr[mid]){
                end=mid-1;
            }
            else if (t>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,14,15,16,17,19,21,23,24,26,27,28,29};
        int target=21;
        System.out.println( findrange(arr,target));

    }
}
