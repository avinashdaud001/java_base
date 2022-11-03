package Practice;

import java.util.Arrays;

public class cyc_sort {
    public static void main(String[] args) {
        int arr[]={2,3,1,5,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
    static int []sort(int arr[]){
        int i=0;
        while (i<arr.length){
            int tep=arr[i]-1;
            if(arr[i]!=arr[tep]){
                int temp=arr[i];
                arr[i]=arr[tep];
                arr[tep ]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
