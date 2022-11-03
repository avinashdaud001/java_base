package recursion;

public class letter_combination_like_phone {
    public static void main(String[] args) {
        String p="";
        String Num="12";
        letter(p,Num);
    }
     static void letter(String p,String num){
        if(num.isEmpty()){
            System.out.println(p);
            return ;
        }
        int digit =num.charAt(0)-'0';
         for (int i =(digit-1)*3; i <digit*3 ; i++) {
             char ch=(char) ('a'+i);
             letter(p+ch,num.substring(1));

         }
    }
}
