package Practice;

import java.util.Arrays;

public class inseartion_sort {
    public static void swap(int arr[],int f,int s){
        int temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
    static int[] sort(int arr[]){
        for (int i = 0; i <=arr.length-2 ; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }

            }

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={4,6,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
