import java.util.Random;
import java.util.Scanner;
class Games{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;
    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNoOfGuesses(int noOfGuesses){
        this.noOfGuesses = noOfGuesses;
    }
    Games(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber == number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low----");
        }
        else if(inputNumber>number){
            System.out.println("Too high----");
        }
        return false;
    }

}
public class Gusses6gamesq {
    public static void main(String[] args) {
Games g = new Games();
boolean b = false;
while(!b){
    g.takeUserInput();
    b = g.isCorrectNumber();

}
    }
}
