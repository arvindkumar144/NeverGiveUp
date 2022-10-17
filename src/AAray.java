public class AAray {
    public static void main(String[] args) {
        /*int[] marks = new int[5];
       int[] marks;
        marks = new int[5];
        int[] marks = {78,90,89,89,34};
        marks[0] = 100;
        marks[1] = 89;
        marks[2] = 10;
        marks[3] = 90;
        marks[4] = 60;


        System.out.println(marks[0]);

         */
//float [] marks ={56.5f,67.89f,78.7f,89.45f,87.21f};
        //String [] marks = {"maath","science","english","computer"};
        //System.out.println(marks.length);
        //System.out.println(marks[2]);
        /*int [] marks = {45,56,66,78,45,};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
         */
        /*int [] marks = {34,45,56,78,89};
        System.out.println("this is called array tervelsation method and inceage method");
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println("this is vcalled decreaging method");
        for(int i =marks.length-1; i>=0;
        i--){
            System.out.println(marks[i]);
        }
        System.out.println("using for each loop");
        for(int element:marks){
            System.out.println(element);
        }
         */
        int [] marks;
        int[][] flats;
        flats = new int[2][3];
        flats[0] [0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;
        for(int i =0; i<flats.length; i++){
            for(int j=0; j<flats[i].length; j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }




    }
}
