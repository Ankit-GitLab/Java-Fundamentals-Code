package Class_And_Object.Grabage_Collection;



class MyClass {
    // programmer ne likha hai taaki samjha sake ki neeche
    // wala method finalize() override ho raha hai.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() called for object");
    }
}

public class Finalize {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj = null; // object ka reference hataya

        System.gc(); // JVM ko request kar rahe GC run karne ke liye

        System.out.println("Main method end");
    }
}
