public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Calc();

        checkCalculation(calc.add(3, 4), 7);
        checkCalculation(calc.mult(3, 4), 12);
        checkCalculation(calc.divide(6, 3), 2);
    }

    private static void checkCalculation(int actual, int expected){
        if (actual == expected) {
            System.out.println("Test passed" );
        } else {
            System.out.println("Test failed! Expected" + expected + ",but actual " + actual);
        }
    }
}


