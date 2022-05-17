public class testingVariableScope {
    public static void main(String[] args) {

        System.out.println("testingConditional \n");

        int age = 16;
        int quantityPeople = 3;
        boolean accompanied;

        if (quantityPeople >= 2) {
            accompanied = true;
        }else {
            accompanied = false;
        }
        System.out.println("value of accompanied = " + accompanied);
        if (age >= 18 || accompanied) {

            System.out.println("Welcome");
        } else {
            System.out.println("unfortunately you can't enter");
        }
    }
}
