public class subseq_of_str {
    public static void main(String[] args) {
        String str="abc";
        String p="";
        seq(p,str);
    }
    static void seq(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        seq(ch+p,str.substring(1));
        seq(p,str.substring(1));
    }
}
