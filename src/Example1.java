public class Example1 {

    public static void main(String[] args) {

        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");
            x = 15; //the result here is that x now has the value of 15
        }

        //The console will now show nothing after x has the value 15
        if (x < 10) {
            System.out.println("Less than 10");
        }
    }
}