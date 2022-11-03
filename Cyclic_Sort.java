package Practice;

import java.util.Arrays;

public class Cyclic_Sort {
    static int [] sort(int arr[]){
        int i=0;
        while(i<arr.length){
            int index=arr[i]-1;
            if(arr[i]!=arr[index]){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={4,3,2,1};
        System.out.println(Arrays.toString(sort(arr)));
    }

}
