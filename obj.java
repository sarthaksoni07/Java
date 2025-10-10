
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

public class obj {

    public static void main(String[] args) {
        Car c1 = new Car(10, "honda");
        c1.Getinfo();
    }
}
