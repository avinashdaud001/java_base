package recursion;

public class reverse_str {
    public static void swap(char arr[],int f,int s){
        char temp=arr[f];
        arr[f]=arr[s];
        arr[s]=temp;
    }
    public static char[] reverseString(char[] s,int start,int end) {
        if(start==end){
            return new char[]{'0'};
        }

        swap(s,start,end);


        reverseString(s, start+1, end-1);
         return s;
    }

    public static void main(String[] args) {
        char c[]={'h','e','l','l','o'};
         ;
        System.out.println(reverseString(c,0,c.length-1));
    }
}

