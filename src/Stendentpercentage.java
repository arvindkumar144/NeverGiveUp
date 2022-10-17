import java.util.Scanner;
public class Stendentpercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your p marks");
        int physics = sc.nextInt();
        System.out.println("Enter your e marks");
        int english = sc.nextInt();
        System.out.println("enter your ch marks");
        int chemistry= sc.nextInt();
        System.out.println("enter math marks");
        int math = sc.nextInt();
        System.out.println("enter computer marks");
        int computer = sc.nextInt();
        float percentage = ((physics+english+chemistry+math+computer)/500.0f)*100;
        System.out.println("percentage :");
        System.out.println(percentage);
    }
}
