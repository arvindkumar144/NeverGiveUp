public class Pporblems3 {
    public static void main(String[] args) {
        String name = "GOD DECISION";
        name = name.toLowerCase();
        System.out.println(name);
        //problem2
        String text = "To Lower     Case";
        text = text.replace("  " ,"__");
        System.out.println(text);
        //problem3
        String letter = " Dear <|name|>,Thanks a lot";
        letter = letter.replace("<|name|>", "Arvind");
        System.out.println(letter);
        //problem4
        String mystring =  "this string coantain   double and triple space";
        System.out.println(mystring.indexOf("  "));
        System.out.println(mystring.indexOf("   "));
        //problem5
        String myletter = " Dear harry,\n\t this java is nice course, \n\t Thanks";
        System.out.println(myletter);



    }
}
