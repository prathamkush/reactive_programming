package SynchronousAndAsynchronous;



public class Synchronous {
    public void subtract(){
        System.out.println("Subtraction");
    }
    public void add(){
        System.out.println("Add");
    }
    public void multiply(){
        System.out.println("Multiply");
    }
    public void division(){
        System.out.println("Division");
    }

    public static void main(String[] args) {
        Synchronous obj1 = new Synchronous();
        obj1.add();
        obj1.subtract();
        obj1.multiply();
        obj1.division();
    }
}
