import java.util.Scanner;
public class sswatch {
    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age>56){
            System.out.println("you are expriced");
        }
        else if(age>46){
            System.out.println("you are semi-expriced");
        }
        else if(age>36){
            System.out.println("you are semi-expriced");
        }
        else{
            System.out.println("you are not expriced");
        }

       switch(age){
           case 18:
               System.out.println("you are going to adult");
               break;
           case 23:
               System.out.println("you are going to join a job");
               break;
           case 60:
               System.out.println("you are old man");
           default:
               System.out.println("enjoy your life");


}
    }
}
