//_______________________________________________Exercise__________________________________________________
//          João is creating an application to calculate the IR from the salary.
//          He looked at the IRPF table and implemented the rules for 15% and 22.5%:


public class TingIR {

    public static void main(String[] args) {

        double wage = 3300.0;

        if (wage < 2600.0) {
            System.out.println("Your rate is 15%");
            System.out.println("You can deduct up to BRL 350");
        }
        if (wage < 3750.0) {
            System.out.println("Your rate is 22.5%");
            System.out.println("You can deduct up to R$636");
        }
    }
}
