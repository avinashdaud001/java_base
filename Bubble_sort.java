package Practice;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,1,3};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int[] sort(int arr[]){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int swap=arr[i];
                    arr[i]=arr[j];
                    arr[j]=swap;
                }
                else{
                    break;
                }
            }

        }
        return arr;
    }
}
