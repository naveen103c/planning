package naveen;

class Covariant {

    Covariant get() {
        return this;
    }
}

class B1 extends Covariant {

    B1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant return type");
    }

    public static void main(String args[]) {
        new B1().get().message();
    }
}
