public class BCstatement {
    public static void main(String[] args) {
       /* for (int i = 0; i<50; i++){
            System.out.println(i);
            System.out.println("Java is Great");
            break;
        }

        */
       /* int i =0;
        do {
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2) {
                System.out.println("ending the loop");
                break;
            }
            i++;
        }while (i<5);
        System.out.println("loop ends here");

        */
        for(int i = 0; i<50; i++){
            if(i==3){
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
    }
}
