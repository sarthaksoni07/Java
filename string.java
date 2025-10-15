
public class string {

    public static void main(String[] args) {
        String s = "sarthak ";// declaration of a string 
        String s1 = "soni";
        // since string is treated as a object of class String in java. we have soem build in function whhich we can use as per our convenience

        System.out.println(s.length()); //8
        System.out.println(s.charAt(3)); // t
        System.out.println(s.toUpperCase()); // 
        System.out.println(s.toLowerCase()); // 
        System.out.println(s.substring(0, 3)); // 
        System.out.println(s.concat(s1)); // Sarthak Soni
        System.out.println(s + s1); // Sarthak Soni
        System.out.println(s.replace("sarthak", "sparsh"));

    }
}
