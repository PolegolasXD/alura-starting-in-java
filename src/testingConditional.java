public class testingConditional {

    public static void main(String[] args) {
        System.out.println("testingConditional \n");

        int age = 16;
        int quantityPeople = 1;
        if (age >= 18) {

            System.out.println("are you older than 18");
            System.out.println("Welcome");

        } else if (quantityPeople >= 2) {

            System.out.println("unfortunately you can't enter");
        } else {
            System.out.println("You are not 18, but you can enter, as you are accompanied");
        }
    }
}



