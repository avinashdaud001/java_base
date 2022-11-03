package recursion;

public class length_of_str {
    static int len(String str){

        if(str.equals("")) {
            return 0;
        }
        else{
            return len(str.substring(1))+1;
        }






    }
    public static void main(String[] args) {
        String st="abcd";
        int ans=len(st);
        System.out.println(ans);
    }
}
