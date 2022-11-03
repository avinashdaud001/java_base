package Searching.BinarySearch;

public class find_peak_in {
    /**
     * // This is MountainArray's API interface.
     * // You should not implement it, or speculate about its implementation
     * interface MountainArray {
     *     public int get(int index) {}
     *     public int length() {}
     * }
     */
//
//
//        public int findInMountainArray(int target,  int Arr[]) {
//            int peak=peak(Arr);
//            int first=binarysearch( Arr,target,0, peak);
//
//            if(first!=-1){
//                return first;
//            }
//
//return descsearch( Arr,target,peak+1,Arr.length);
//
//
//
//        }



    public   int peak(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
//    public int binarysearch(int arr[], int target,int start,int end){
//
//        while(start<=end){
//            int mid =start+(end-start)/2;
//            if(target>arr[mid]){
//                start=mid;
//            }
//            else if(target<arr[mid]){
//                end=mid;
//            }
//            else{
//                return mid;
//            }
//
//        }
//        return -1;
//    }
//    public  int descsearch(int arr[],int target,int start,int end){
//        //  int start=0;
//        // int end=arr.length-1;
//        while(start<=end){
//            int mid =start+(end-start)/2;
//            if(target<arr[mid]){
//                start=mid;
//            }
//            else if(target>arr[mid]){
//                end=mid;
//            }
//            else{
//                return mid;
//            }
//
//        }
//        return -1;
//    }
    public static void main(String[] args) {
            find_peak_in avi =new find_peak_in();
//        int arr[]={1,2,3,4,5,3,1};
//        int arr[]={0,1,2,4,2,1};
//        int target=4;
        int arr[]={5,1,2};
        System.out.println(avi.peak(arr));
//        System.out.println(avi.findInMountainArray(target,arr));

    }

}



