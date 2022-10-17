import java.sql.SQLOutput;

public class Logical {
    public static void main(String[] args) {
        System.out.println("for logical AND");
        boolean  a = true;
        boolean b = true;
        boolean c = true;
        if(a && b && c){
            System.out.println("y");
        }
        else{
            System.out.println("n");

        }
        System.out.println("for logic OR");
        if(a||b||c){
            System.out.println("y");
        }
        else{
            System.out.println("n");
        }
        System.out.println("for logical NOT");
        System.out.println("Not(a) is");
        System.out.println(!a);
        System.out.println("Not(b) is");
        System.out.println(!b);
    }
}
