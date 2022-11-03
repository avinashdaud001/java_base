package recursion;

public class print_No_reverse {
    public static void printNos(int N)
    {
        //Your code here


        if(N>0) {


            printNos(N - 1);
            System.out.print(N + " ");
        }
        return;
//        int b=11-(N-1);

    }

    public static void main(String[] args) {
        int n=10;
        printNos(n);
    }
}
