package Class_And_Object.Grabage_Collection;



class Demo {
    public void finalize() {
        System.out.println("Object destroyed");
    }
}

public class Grabage {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1 = null; // Object no longer referenced

        System.gc(); // Request JVM for garbage collection
    }
}

