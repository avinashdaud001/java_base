package Searching.BinarySearch;

public class find_greatest_char {

       static char nextGreatestLetter(char[] arr, char target) {
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }


            }
           return target>arr[arr.length-1]?arr[0]:arr[start];
        }

    public static void main(String[] args) {
        char []c={'c','f','j'};
        char k='e';
        System.out.println(nextGreatestLetter(c,k));
    }
}
