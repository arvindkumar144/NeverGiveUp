import java.util.Scanner;

public class sporblem {
    public static void main(String[] args) {
      //  int  age = 10;
       // if(age == 11) {
            //System.out.println("i am 11");
       // }
        //else{
         //   System.out.println("i am not 11");
       // }
      /*  byte m1, m2 , m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("enter your marks in chemistry");
        m2 = sc.nextByte();
        System.out.println("enter your marks in mathmatics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("you percentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congratulation , you have been promoted");
        }
        else{
            System.out.println("sorry, you have not been promoted please try again");
        }

       */
        //problem3
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income in lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax+0;
        }
        else if(income>2.5f && income<= 5f){
            tax = tax+0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10.0f){
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(income-5f);
        }
        else if (income > 10.0f) {
            tax = tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(10.0f-5.0f);
            tax = tax+0.3f*(income-10.0f);
        }

        System.out.println("The total tax paid by the employee is:" +tax);
        */
       /* Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wensday");
                break;
            case 4 :
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
        }

        */
        //problem6
       /* Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("this is the organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("this is commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("this is indian website");
        }

        */
        //problem5
        System.out.println("enter  days ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day){
            case 365:
                System.out.println("this is normal year");
                break;
            case 366:
                System.out.println("this is leap year");
                break;
        }

    }
}
