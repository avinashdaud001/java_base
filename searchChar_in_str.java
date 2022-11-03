package Searching;

public class searchChar_in_str {
    static boolean search(String a,char b){
        if(a.length()==0){
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b){
                return  true;
            }

        }
//      OR ALSO ANOTHR WAY
//        for (char ch:a.toCharArray()){
//            if(ch==b){
//                return true;
//            }
//        }
        return false;
    }
    public static void main(String[] args) {
        String a="avinash";
        char c='v';
       boolean b= search(a,c);
        System.out.println(b);
    }
}
