package cyclic_sort;

public class cyclic_duplicate_no_find {
    static int sort(int[] arr){
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
        for( int j=0;j<arr.length;j++){
            if(j!=arr[j]-1){
                return arr[j];
            }
        }
        return -1;
    }
    static   void swap(int []b,int start,int end){


        int swap=b[start];
        b[start]=b[end];
        b[end]=swap;




    }

    public static void main(String[] args) {
        int arr[]={2,4,2,1};
        System.out.println(sort(arr));
//        System.out.println(Arrays.toString(sort(arr)));
    }

}
