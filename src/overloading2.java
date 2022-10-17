public class overloading2 {
    static void foo(){
        System.out.println("good morning bro!");
    }
    static void foo(int a){
        System.out.println("good morning" +a+ "bro!");
    }
    static void foo(int a, int b){
        System.out.println("good morning" +a+ "bro!");
        System.out.println("good morning " +b+ "bro!");
    }
    static void foo(int a, int b , int c){
        System.out.println("good morning" +a+ "bro!");
        System.out.println("good morning" +b+ "bro!");
    }
    static void change(int a){
        a = 98;
    }
    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void telljoke() {
        System.out.println("i invented a new  world!\n" + "Plagiarism!");
    }
    public static void main(String[] args) {
foo();
foo(300);
foo(3000, 4000);
    }
}
