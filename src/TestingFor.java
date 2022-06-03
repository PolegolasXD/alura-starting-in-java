public class TestingFor {

    public static void main(String[] args) {

        int counter = 0;
        int total = 0;

        for(int counter1 = 0; counter1 <= 10; counter1++){
            System.out.println(counter + " + ");

            while(counter <= 10 ){

                total += counter;
                counter++;

            }


        }

        System.out.println("A soma é: " + total);

    }

}
