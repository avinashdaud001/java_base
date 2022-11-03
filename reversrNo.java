import java.util.Scanner;

public class reversrNo {
    public static void main(String[] args) {
        int rem;
        int rev=0;
        int n;
        Scanner avi=new Scanner(System.in);
        System.out.println("enter any number we will give rverse");
        n= avi.nextInt();
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
    }
}
