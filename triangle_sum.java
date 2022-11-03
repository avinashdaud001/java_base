package recursion;

import java.util.Arrays;

public class triangle_sum {
    static void sum(int arr[]) {


  if(arr.length<1){
       return ;
  }
        int n[] =new int[arr.length-1];
        for (int i = 0; i < arr.length-1; i++) {
           int x=arr[i]+arr[i+1];
                n[i] = x;


        }
         sum(n);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        sum(arr);
//        System.out.println(Arrays.toString(sum(arr)));
    }
}
