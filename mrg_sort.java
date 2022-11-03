package Practice;

import java.util.Arrays;

public class mrg_sort {
    public static void main(String[] args) {
        int arr[]={4,5,6,1,2,3};
        System.out.println(Arrays.toString(devide(arr)));
    }
    static int [] devide(int arr[]){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=devide(Arrays.copyOfRange(arr,0,mid));
        int right[]=devide(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int []merge(int l[],int r[]){
        int N[]=new int[l.length+r.length];
        int i=0;
        int j=0;

                int k=0;
                while(i<l.length&&j<r.length){
                    if(l[i]<r[j]){
                        N[k]=l[i];
                        i++;
                        k++;
                    }
                    else{
                        N[k]=r[j];
                        j++;
                        k++;
                    }
                }
                while(i<l.length){
                    N[k]=l[i];
                    i++;
                    k++;
                }
                while(j<r.length){
                    N[k]=r[j];
                    j++;
                    k++;

                }
                return N;

    }
}
