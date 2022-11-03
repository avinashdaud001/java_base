package Searching.BinarySearch;

import java.util.Arrays;

public class find_targetduplecate_values_indx {
    static int[] findindex(int arr[],int target){
        int ans[]={-1,-1};
        int start=search(arr,target,true);

        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int arr[],int target,boolean find){
        int start=0;
        int end=arr.length-1;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(find==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,7,7,7,2,5,5,6,6};
        int target=5;
        System.out.println(Arrays.toString(findindex(arr,target)));
    }
}
