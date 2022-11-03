public class count_steps {
    public static void main(String[] args) {
        int n=14;
        int step=0;
        int ans=step(n,step);
        System.out.println(ans);
    }
    static int step(int n,int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
           return  step(n/2,step+1);
        }
        return step(n-1,step+1);
    }
}
