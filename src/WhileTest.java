public class WhileTest {
    public static void main(String[] args) {
        int counter = 0;
        while( counter <= 10) {
            System.out.println(counter);
//            counter = counter + 1
//            counter = counter += 1;
            counter++;
        }
        System.out.println(counter);
    }
}
