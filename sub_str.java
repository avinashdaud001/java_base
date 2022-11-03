package Practice;

public class sub_str {
    public static void main(String[] args) {
        String str="abc";
        String p="";
        sub(p,str);
    }
    static void sub(String p,String str){
        if(str.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=str.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());

            sub(f+ch+s,str.substring(1));

        }

    }
}
