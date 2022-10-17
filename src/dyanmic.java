class Phone{
    public void ShowTime(){
        System.out.println("time is 8 am");
    }
    public void on(){
        System.out.println("Turning on phone-----");
    }
}
class SmartPhone extends Phone{
    public void music (){
        System.out.println("playing music ----");
    }
    @Override
    public void on(){
        System.out.println("Turning on smartphone----");
    }
}
public class dyanmic {
    public static void main(String[] args) {
        Phone obj = new Phone();// Allowed
        //SmartPhone obj = new SmartPhone();
        //obj.name();
       // Phone obj = new SmartPhone();//yes it is allowed
        //SmartPhone obj2 = new Phone();//Not Allowed
        obj.ShowTime();
        obj.on();
        // obj.music (); // Not Allowed

    }
}
