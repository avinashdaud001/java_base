package cyclic_sort;

import java.util.Arrays;

public class cyclic_sort_missing_no {

        public static int missingNumber(int[] arr) {
            int i=0;
          
            while(i<arr.length){
                if(arr[i]<arr.length&&arr[i]!=i){
                    swap(arr,i,arr[i]);
                }
                else{
                    i++;
                }
            }
            System.out.println(Arrays.toString(arr));
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=j){
                    return j;
                }

            }
            return arr.length;
        }
    static   void swap(int []b,int start,int end){


            int swap=b[start];
            b[start]=b[end];
            b[end]=swap;




    }

    public static void main(String[] args) {
        int arr[]={5,3,2,1,0};

        System.out.println(missingNumber(arr));
    }
    }

