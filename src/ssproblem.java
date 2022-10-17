
import java.util.Scanner;
import java.util.Random;

public class ssproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rang = new Random();
        byte points = 0;


        System.out.println("-- Enter 0 for ' Rock ', Enter 1 for ' Paper ', Enter 2 for ' Scissor ' --");
        for (int round = 0; round<3; round++){

            int codeOutput = rang.nextInt(3);
            int userInput = sc.nextInt();

            if(userInput == 0){
                if(codeOutput == 0){
                    System.out.println(codeOutput+"\n");
                    System.out.println("Tie");
                }
                else if (codeOutput == 1){
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point +");
                    points ++;
                }
                else {
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point -");
                    points --;
                }
            }

            else if(userInput == 1){
                if(codeOutput == 0){
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point +");
                    points ++;
                }
                else if(codeOutput == 1){
                    System.out.println(codeOutput+"\n");
                    System.out.println("Tie");
                    points ++;
                }
                else {
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point -");
                    points --;
                }
            }

            else if (userInput == 2){
                if(codeOutput == 0){
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point +");
                    points --;
                }
                else if(codeOutput == 1){
                    System.out.println(codeOutput+"\n");
                    System.out.println("One Point -");
                    points ++;
                }
                else{
                    System.out.println(codeOutput+"\n");
                    System.out.println("Tie");
                    points ++;
                }
            }
        }
        System.out.println(points+" Points ");
    }
}

