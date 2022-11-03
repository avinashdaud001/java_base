package Searching.BinarySearch;

public class floor {




        static int floo(int arr[], int t) {
            int start=0;
            int end=arr.length-1;
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
            return end;
        }

        public static void main(String[] args) {
            int arr[]={11,12,13,16,18};
            int t=15;
            System.out.println(floo(arr,t));
        }
    }


