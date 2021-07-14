package naveen;

public class MethodOverloading {

    int calculate(int l, int b) {
        return l * b;
    }

    int calculate(int l, int b, int h) {
        return l * b * h;
    }

    String calculate(String Name) {
        return "My Name is " + Name;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.calculate(10, 20));
        System.out.println(obj.calculate(10, 20, 30));
        System.out.println(obj.calculate("Naveen"));

        try {
            System.exit(0);
            int a=0/0;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("I don't know if this will get printed out");
        }
    }

}
