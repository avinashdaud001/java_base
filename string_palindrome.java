package String;

public class string_palindrome {
    static boolean check(String s){
        for (int i = 0; i < s.length()/2; i++) {
            int start=s.charAt(i);
            int end=s.charAt(s.length()-1-i);
            if(s==null||s.length()==0){
                return true;
            }
            if(start!=end){
                return false;
            }


        }

        return true;
    }

    public static void main(String[] args) {
        String str="abcba";
        System.out.println(check(str));
    }
}
