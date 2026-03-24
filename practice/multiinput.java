public class multiinput{
    public void count(int ...numbers){
        for ( int i : numbers){
            System.out.println(i);
        }
    }
// these three dots are there to take multple number of inputs
      public void main(String[] args){
         count(1,2,3,4,5,6);
         count(1,2,3,4,5,6);
      }
}