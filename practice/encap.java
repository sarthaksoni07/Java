
class Person {

    private int age;// this is a private data means it cannot be acesses using object.name or object.age
    private String name;

    Person(int i, String s) {
        this.age = i;
        this.name = s;
    }

    void changeage(int i) {
        this.age = i;
    }

    void changename(String s) {
        this.name = s;
    }

    void Sayname() {
        System.out.println(this.name);
    }

    void Sayage() {
        System.out.println(this.age);
    }

}

public class encap {

    public static void main(String[] args) {
        Person S1 = new Person(20, "sarthak");
        S1.Sayage();
        S1.Sayname();
        S1.changeage(16);
        S1.changename("sparsh");
        // S1.name
        // S1.age  this is void because the data is private and cannot be accessed publically 

    }
}
