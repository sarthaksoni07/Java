
class Car {

    int speed;
    String name;

    Car(int i, String s) {
        this.speed = i;
        this.name = s;
    }

    void Getinfo() {
        System.out.println(this.speed + " " + this.name);
    }
}

class Engine extends Car {

    int horsepower;
    int year;
    String Brand;

    Engine(int s, String Name, int i, int y, String brand) {
        super(s, Name);
        this.horsepower = i;
        this.year = y;
        this.Brand = brand;
    }

    void Start() {
        System.out.println("engine is started");
    }

    void EngInfo() {
        System.out.println(this.Brand);
        System.out.println(this.horsepower);
        System.out.println(this.name);
        System.out.println(this.speed);
        System.out.println(this.year);

    }

}

public class obj {

    public static void main(String[] args) {
        Car c1 = new Car(10, "honda");
        c1.Getinfo();
        Engine E1 = new Engine(100, "honda", 600, 2025, "mitsubishi");
        E1.Start();
        E1.EngInfo();
    }
}
