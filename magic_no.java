public class magic_no {
    static int magic(int n){
        int ans=0;
        int base=5;
        while (n>0){
            int last=n&1;
             ans+=last*base;
             base=base*5;
            n=n/2;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=1;
        int s=magic(n);
        System.out.println(s);

    }
}
