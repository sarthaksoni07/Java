
public class Mgenmet {

    public static void main(String[] args) {
        Box<Integer> B = new Box<>(10);
        System.out.println(B.getValue());
        square <Integer,String> A = new square<>(10,"sarthak");
        A.getValue();
    }

}

class Box<T> {

    T data;

    Box(T Data) {
        this.data = Data;
    }

    public T getValue() {
        return data;
    }

    public void setValue(T value) {
        this.data = value;
    }
}

class square<T,K>{
    T first;
    K second;

    square(T first, K second){
        this.first=first;
        this.second=second;
    }

    public void getValue(){
        System.out.println(this.first);
        System.out.println(this.second);
    }
}
