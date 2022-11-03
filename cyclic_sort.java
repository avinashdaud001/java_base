package cyclic_sort;

import java.util.Arrays;

public class cyclic_sort {
    static   void swap(int []b,int start,int end){


        int swap=b[start];
        b[start]=b[end];
        b[end]=swap;




    }
    static  int  cyclic( int arr []){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if( arr[i]>0&&arr[i]<arr.length&&arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else {
                i++;

            }

        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]-1!=j){
                return j+1;
            }
        }


return arr.length+1;
    }


    public static void main(String[] args) {
        int arr[]={ 1,1};
//        cyclic(arr);
        System.out.println((cyclic(arr)));
    }

}
