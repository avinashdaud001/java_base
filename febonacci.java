import java.util.Scanner;

public class febonacci {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        int temp;
        Scanner avi=new Scanner(System.in);
        System.out.println("enter number ");
        int n=avi.nextInt();
        while(n!=0){
            temp=a+b;
            a=b;
            b=temp;
            n--;
            System.out.println(temp);

        }
    }
}
