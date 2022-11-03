package recursion;

public class febbonacci_Series {
    public static void main(String[] args) {
        int ans=febo(7);
        System.out.println(ans);
    }
    static int febo(int n){
        if(n<2){
            return n;
        }
        return febo(n-1)+febo(n-2);
    }
}
