package recursion;

public class found_in_str_capital {
    static char search(String b,int i){
        if(b.charAt(i)=='\0'){
            return 0;
        }
        if(Character.isUpperCase(b.charAt(i))){
            return b.charAt(i);
        }
        return search(b,i+1);
    }
    public static void main(String[] args) {
        String b="geeKsforG";
        int i=0;
        char v=search(b,i);
        System.out.println(v);
    }
}
