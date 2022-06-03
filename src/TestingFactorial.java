public class TestingFactorial {

    public static void main(String[] args) {
        int factorial = 1;
        for (int i =1; i < 11; i++){
            factorial = factorial * i;
            System.out.println("factorial of " + i + " = " + factorial);
        }
    }

}
