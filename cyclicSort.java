package cyclic_sort;

import java.util.Arrays;

public class cyclicSort {





        static int[] sort(int arr[]){
            int i=0;
            while(i<arr.length){
                int temp=arr[i]-1;
                if(arr[i]!=arr[temp]){
                    swap(arr,i,temp);
                }
                else{
                    i++;
                }
            }
            return arr;
        }
        static   void swap(int []b,int start,int end){


            int swap=b[start];
            b[start]=b[end];
            b[end]=swap;




        }

        public static void main(String[] args) {
            int arr[]={2,4,3,1};
            System.out.println(Arrays.toString(sort(arr)));
        }
    }


