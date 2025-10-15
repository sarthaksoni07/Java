
public class array {

    public static void main(String[] args) {
        // to declare 
        int[] number = new int[5];// declare then assign
        number[0] = 1;
        number[1] = 1;
        number[2] = 1;
        number[3] = 1;
        number[4] = 1;
        System.out.println(number[1]);

        // declare and assign
        int[] number1 = {1, 2, 3, 4, 5, 6};
        System.out.println(number1[1]);

        for (int i = 0; i < number1.length; i++) {// number1.length gives ths length of an array 

            System.out.println(number1[i]);

        }
        for (int n : number) {// same but cleaner
            System.out.println(number[n]);
        }

        //array of things
        String[] fruits = {"apple", "banana", "pear"};
        
      for(String name :fruits){
        System.out.println(name);
      }
    }
}
