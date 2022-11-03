public class reverse {
    public static void main(String[] args) {
        int n=12345;

  rev(n);
    }
    static void rev(int n){
        if(n==0){
            return;
        }
        System.out.print(n%10);
         rev(n/10);

    }
}
