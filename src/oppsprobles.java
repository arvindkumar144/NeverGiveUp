class Employee {
    int salary;
    String name;

    public int getsalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public String SetName(String n) {
        return name = n;
    }
}
    class cellPhone{
        public void ring(){
            System.out.println("Ringing....");
        }
        public void vibrate(){
            System.out.println("Vibrating...");
        }
        public void callfriend(){
            System.out.println("Calling mukul");
        }
    }
    class sqaure{
    int side;
    public int area() {
        return side * side;
    }
    public int perimeter(){
        return 4*side;
    }
    }
    class rectangle{
    int side;
    public int area(){
        return side * side;
    }

    int n;
    public int perameter(){

        return 2*side;
    }

        public int side() {
        return  side;
        }
    }
    class Tommy{
    public void hit(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("runing frome the enemy");
    }
    public void fire(){
        System.out.println("firing the enemy");
    }
    }

public class oppsprobles {
    public static void main(String[] args) {
        //problem1
/*Employee harry = new Employee();
harry.SetName("codewith harry");
        harry.salary = 233;
        System.out.println(harry.getsalary());
        System.out.println(harry.getName());
        //problem2
        cellPhone asus = new cellPhone();
        asus.callfriend();
        asus.vibrate();
        asus.ring();

 */
        /*sqaure sq = new sqaure();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

         */
        rectangle re = new rectangle();
        re.side = 8;
        System.out.println(re.side());
        System.out.println(re.perameter());
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
