public class Asc_desc_Searching {
    static int Search(int arr[],int t) {
        int start=0;
        int end=arr.length-1;
        boolean isASC=arr[0]>arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(t==arr[mid]){
                return mid;
            }

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
        int arr[]={25,24,23,22,21,20,};
        int t=19;
        System.out.println(Search(arr,t));
    }
}
