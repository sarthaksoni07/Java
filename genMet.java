
public class genMet {

    // generic method or function overlaoding 
    public static <T> void Print(T item1) {
        System.out.println("item is " + item1);
    }

    public static <T> void printArr(T[] arr) {
        for (T element : arr) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Print("sarthak");
        Print(1);
        Integer[] arr = {1, 3, 4, 5, 5};// we used the wrapper class becasue generic method only work with objects and not primitive data types
        
        printArr(arr);
    }

}
