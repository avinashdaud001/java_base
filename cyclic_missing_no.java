package cyclic_sort;

import java.util.ArrayList;
import java.util.List;

public class cyclic_missing_no {

    static   void swap(int []b,int start,int end){


        int swap=b[start];
        b[start]=b[end];
        b[end]=swap;




    }
        public static List<Integer> findDisappearedNumbers(int[]  arr) {

            int i=0;
            while(i<arr.length){
                int correct=arr[i]-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }
                else{
                    i++;
                }
            }
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<arr.length;j++){
                int temp=arr[j]-1;
                if(arr[j]!=arr[temp]){
                    list.add(i+1);
                }
            }
            return list;

        }

    public static void main(String[] args) {
        int arr[]={4,3,2,7,8,2,3,1};




        findDisappearedNumbers(arr);
        System.out.println( arr);
    }

}
