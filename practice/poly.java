
public class poly {

    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.Sound();
        a1 = new Cat();
        a1.Sound();

        Calculator C = new Calculator();
        System.out.println(C.add(1, 2));
        System.out.println(C.add(1.22, 2.66));
        System.out.println(C.add(1, 2, 3));
    }
}

class Animal {// class animal represents method overriding

    void Sound() {
        System.out.println("animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void Sound() {
        System.out.println("Dog Barks");
    }
}

class Cat extends Animal {

    @Override
    void Sound() {
        System.out.println("Cat meows");
    }
}

class Calculator {// class animal represent method overloading

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
//
