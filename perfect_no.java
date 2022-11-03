public class perfect_no {
    static String perfect_no(int n) {
        int sum=0;
        for (int i = 1; i < n; i++){
            if(n%i==0){
              sum+=i;
            }

        }
        if(n==sum){
            return "yes";
        }
        else{
            return "no";
        }

    }

    public static void main(String[] args) {
        int a=6;
        System.out.println( perfect_no(a));


    }

}
