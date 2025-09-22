class Mainn {
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Child extends Mainn {

    @Override
    public int calculate(int a, int b) {
        System.out.println("Executing overridden method in Child class.");
        return a * b;
    }

    public int calculate(int a, int b, int c) {
        System.out.println("Executing overloaded method in Child class.");
        return a + b + c;
    }
}

public class Mainn {
    public static void main(String[] args) {
        Child child = new Child();

        int result1 = child.calculate(10, 5);
        System.out.println("Result of overriding: " + result1);
        System.out.println("---");

        int result2 = child.calculate(10, 5, 2);
        System.out.println("Result of overloading: " + result2);
    }
}