import java.util.Scanner;

public class checking_rptno {
    public static void main(String[] args) {
        int rem;
        int count=0;
        int n;
        Scanner avi =new Scanner(System.in);
        System.out.println("enter any number");

        n=avi.nextInt();
        System.out.println("enter number which you want to compare");
        int b=avi.nextInt();
        while(n>0){
            rem=n%10;
            if(rem==b){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
