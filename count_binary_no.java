public class count_binary_no {
    static int count(int n,int b){
        int ans= (int) (Math.log(n)/Math.log(b)+1);
        return ans;
    }
    public static void main(String[] args) {
        int n=25;
        int b=2;
        int ans=count(n,b);
        System.out.println(ans);
    }
}
