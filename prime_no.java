import java.util.Scanner;

public class prime_no {
    static boolean isprime(int n){
        int i=2;
        while(i*i<=n){
            if(n%i==0){
              return false;
            }
            i++;

        }
        return i*i>n;

    }
    public static void main(String[] args) {
//        Scanner avi=new Scanner(System.in);
        int c=0;
//        System.out.println("enter any number");
//        int n=avi.nextInt();
        for(int i=2;i<100;i++){
            if(isprime(i)){
                System.out.print(i+" ");
                c++;
            }
        }
        System.out.println();
        System.out.println("total prime number betn 1 to 100------>>> ("+c+")");
//        System.out.println( isprime(n));

    }

}

