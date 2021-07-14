package naveen;

public class Employee {

    int id;
    String Name;
    Address address;

    public Employee(int id, String Name, Address address) {
        this.id = id;
        this.Name = Name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + Name);
        System.out.println(address.city + " " + address.State);
    }

    public static void main(String[] args) {
        Address a1 = new Address("aJMER", "rAJ");
        Employee e1 = new Employee(1, "Naveen", a1);
        e1.display();
    }

}
