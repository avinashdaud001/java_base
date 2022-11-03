public class first_missing_no {
    public  static int firstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]>0&&arr[i]<arr.length&&i!=arr[i]-1){
                swap(arr,i,arr[i]-1);
            }
            else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(j+1!=arr[j]){
                return j+1;
            }
        }
        return arr.length+1;
    }

    public static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    public static void main(String[] args) {
        int arr[]={1,1};
        System.out.println(firstMissingPositive(arr));
    }

}

