import java.util.Random;
import java.util.Scanner;
public class sssproblem {
    public static void main(String[] args) {
        int count , usercount = 0, comcount = 0, taidcount =0;
        for(count = 0; count<5; count++){
            System.out.println("enter your choose\n1.STONE\n2.PAPER\n3.SIZER");
            Scanner sc = new Scanner(System.in);
            int user = sc.nextInt();
            if(user==1)
                System.out.println("user choice:STONE");
            else if(user==2)
                System.out.println("user choice:PAPER");
            else if(user ==3)
                System.out.println("user choice:SIZER");
            else
                System.out.println("wrong input");
            Random rand = new Random();
            int computer = rand.nextInt(3);
            if(computer == 0)
                System.out.println("computer choice:STONE");
            else if(computer == 1)
                System.out.println("computer choice:PAPER");
            else
                System.out.println("computer choice:SIZER");
            if(user == 1 && computer == 0 || user == 2 && computer == 2){
                System.out.println("MATCH IS TIAD\n");
                taidcount++;
            }
            else if (user == 1 && computer == 2 || user == 2 && computer == 0 || user == 3 && computer == 1);
            {
                System.out.println("you are win!\n");
                usercount++;
            }
            {
                System.out.println("computer win!\n");
                comcount++;
            }
        }
        System.out.println("you win" +  usercount+ "TIMES");
        System.out.println("COMPUTER WIN" + comcount+ "TIMES");
        System.out.println("TAID " + taidcount+ "TIMES");
    }
}
