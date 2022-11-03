package recursion;

public class febo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(febbo(n));
    }
    static int febbo(int n){
        if(n<2){
            return n;
        }
        return febbo(n-1)+febbo(n-2);
    }
}
