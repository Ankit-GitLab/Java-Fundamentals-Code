package Method;

public class Scope {
    static int i;
    public static void main(String[] args) {
         i = 16;
        System.out.println(i);
        int i = 23;
        System.out.println(i);
        fun();
    }
    public static void fun(){
        System.out.println(i);
    }
}
