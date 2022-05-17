public class TestingConditional2 {
    public static void main(String[] args) {
        System.out.println("testingConditional \n");

        int age = 16;
        int quantityPeople = 3;
        boolean accompanied =  quantityPeople >= 2;
        System.out.println("value of accompanied = " + accompanied);
        if (age >= 18 || accompanied) {

            System.out.println("Welcome");
        } else {
            System.out.println("unfortunately you can't enter");
        }
    }
}
