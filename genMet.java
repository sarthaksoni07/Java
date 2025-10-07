public class genMet{
    // generic method or function overlaoding 
    public static <T> void Print(T item1){
        System.out.println("item is " + item1);
    }
    public static void main(String[] args){
       Print("sarthak");
       Print(1);
    }
}