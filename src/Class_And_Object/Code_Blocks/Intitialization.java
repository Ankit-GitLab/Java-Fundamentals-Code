package Class_And_Object.Code_Blocks;

public class Intitialization {

    // Instance Initialization Block
    {
        System.out.println("Instance Initialization Block");
    }

    // Constructor
    Intitialization() {
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        Intitialization obj1 = new Intitialization();
        Intitialization obj2 = new Intitialization();
    }
}
