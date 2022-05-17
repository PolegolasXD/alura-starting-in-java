public class ExerciseWage {

    public static void main(String[] args) {

        double wage = 3300.0;

        if (wage <= 1900.00 && wage >= 2800.00) {
            System.out.println("Your rate is 7,5%");
            System.out.println("You can deduct up to R$ 142");
        }
        if (wage <= 2800.01 && wage >= 3751.00) {
            System.out.println("Your rate is 15%");
            System.out.println("You can deduct up to R$350");

        }else {
            System.out.println("Your rate is 22.50");
            System.out.println("You can deduct up to R$ 636");
        }

    }

}
