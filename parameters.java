
public class parameters {

    public void swap(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swap " + a + " " + b);

    }

    public void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("before swap " + a + " " + b);

        swap(a, b);
    }
}
