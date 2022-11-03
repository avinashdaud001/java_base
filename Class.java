package oops;

public class Class {

    String name;
    int roll;

    Class(int roll){
         this.roll=roll;
    }
    public void method(String name,int roll){
        System.out.println(this.name+""+this.roll);
    }

    public static void main(String[] args) {
        Class avi=new Class(38);
        avi.name="avi";

        avi.method( "avi", avi.roll);
        System.out.println(avi.name+""+avi.roll);
    }

}
