
import java.util.ArrayList;

public class generics {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Mango");
        // fruits.add(10); // Uncomment this line and see what error appears!

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        Box<String> box1 = new Box<>("Hello");
        Box<Integer> box2 = new Box<>(123);

        String str = box1.getData();  // ✅ No casting needed
        int num = box2.getData();     // ✅ No casting, no runtime error

        System.out.println(str);
        System.out.println(num);
    }
}

class Box<T> {

    T data;

    Box(T data) {
        this.data = data;
    }

    T getData() {
        return data;
    }
}
