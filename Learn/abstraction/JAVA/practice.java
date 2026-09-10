interface  A {
    int age=44;
    String area="delhi";
    void show();
    void config();

}
class B implements A {
    public void show() {
        System.out.println("in show");
    }
    public void config() {
        System.out.println("in config");
    }
}
public class practice {
    
    public static void main(String a[])
    {
        A obj=new B() ;
        obj.show();
        obj.config();
        
    }
}
