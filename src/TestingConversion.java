public class TestingConversion {
    public static void main(String[] args) {

        double wage = 1270.50;

//        float floatPoint = 3.14;

        int value = (int) wage;
        System.out.println(value);

        double value1 = 0.2;
        double value2 = 0.1;
        double total = value1 + value2;

        System.out.println(total);

//        type (int) can hold up to two billion numbers or characters

//        if you have to store a number greater than this, use the (long) which stores two billion squared
        long bigValue = 200000;
        int intValue = 200000;
        short smallValue = 2131;
        byte byteValue = 127;


//        Exercise

        int age = 20;
        System.out.println("Mark's age is 30!");

        int thirty = 10 + 20;
        System.out.println("Mark's age is" + thirty);

        double age2 = 30.0;
        System.out.println("Mark's age is " + (int) age2 + "!");

        int age3 = 3 * 10;
        System.out.println("Mark's age is " + age3 + "!");

        int age4 = 30;
        System.out.println("Mark's age is " + age4 + "!");
    }
}
