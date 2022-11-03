package Practice;

import java.util.Arrays;

public class inseart_sort {





        public static void main(String[] args) {
            int arr[]={2,4,5,6,1,3};
            System.out.println(Arrays.toString(sort(arr)));
        }
        static int[] sort(int arr[]){
            for (int i = 0; i <arr.length-1 ; i++) {
                for (int j = i+1; j >0; j--) {
                    if(arr[j]<arr[j-1]){
                        int swap=arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=swap;
                    }
                    else{
                        break;
                    }
                }

            }
            return arr;
        }


}
