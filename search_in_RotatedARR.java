public class search_in_RotatedARR {
    public static void main(String[] args) {
        int arr[]={ 5,1,2};
        int target=5;
        System.out.println(ans(arr,target));
    }
    static int ans(int arr[],int target){
        int peak=peak(arr);
        int ASC=Search(arr,target,0,peak);
        int sec=Search(arr,target,peak+1,arr.length-1);
        if(ASC!=-1){
            return ASC;
        }
        return sec;
    }
    static int peak(int arr[]){
        int start=0;
       int end=arr.length-1;

       while(start<=end){
           int mid=start+(end-start)/2;
           if(arr[start]>arr[mid]){
               end=mid-1;
           }
           else{
               start=mid+1;
           }
           if(mid<end&&arr[mid]>arr[mid+1]){
               return mid;
           }
           if(start<mid&&arr[mid]<arr[mid-1]){
               return mid-1;
           }
       }
       return -1;

    }
    static int Search(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
