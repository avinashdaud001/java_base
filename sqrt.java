public class sqrt {
    static int pow(int n,int p){
        int start=0;
        int end=n;
        while(start<end) {


            int mid = start + (end - start) / 2;
            if(mid*mid==n){
                return mid;
            }
            if(mid<n){
                start=mid;
            }
            else{
                end=n-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=40;
        int p=3;
        System.out.println(pow(n,p ));
    }
}
