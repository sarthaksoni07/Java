// generic class in java 
// generic classs in java is used to create a classs which does not have a defined data type until we use it to declare an object from it 
// we use this so that we do not have to create different classes for different data types. we use is while definin out object on what data are we going to store in it 

class Box<T> {

    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class genClass {

    public static void main(String[] args) {
        Box<String> b1 = new Box<>();
        b1.setContent("sarthak");
        System.out.println(b1.getContent());
    }

}