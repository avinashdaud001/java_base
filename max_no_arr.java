public class max_no_arr {
    static int max(int []n){
        int max=n[0];
        for (int i = 0; i < n.length; i++) {
            if(n[i]>max){
                max=n[i];
            }

        }
        return max;

    }
    static int maxRange(int a[], int start,int end ){
        int max=a[start];
        for (int i = start; i < end; i++) {
            if(a[i]>max){
                max=a[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {
        int b[]={1,45,2,0,6,8};
        System.out.println(max(b));
        System.out.println(maxRange(b,2,6));
    }
}
