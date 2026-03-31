
class Rectangle {

    int length;
    int breadth;

    boolean isEqual(Rectangle r) {
        if (this.length == r.length && this.breadth == r.breadth) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.length = 10;
        a.breadth = 10;
        Rectangle b = new Rectangle();
        b.length = 10;
        b.breadth = 10;
        boolean equal = a.isEqual(b);
        if (equal) {
            System.out.println("equal");
        } else {
            System.out.println("unequal");
        }
    }
}
