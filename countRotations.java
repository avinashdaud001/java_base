import java.util.Scanner;

public class countRotations {
    static int count (int arr[]){
        int pivot=max(arr);
        return pivot+1;
    }
    static int max(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end&&arr[mid]>arr[mid+1]){
                return mid;

            }
            if(mid>start&&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<=arr[mid]&&arr[mid]>arr[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner avi=new Scanner(System.in);
        System.out.println("enter array size");
        int size=avi.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array value");
        for (int i = 0; i <size ; i++) {
            arr[i]=avi.nextInt();
        }
        System.out.println(count(arr));
    }

}


