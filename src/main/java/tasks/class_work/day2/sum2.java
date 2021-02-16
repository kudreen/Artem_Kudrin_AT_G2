//import java.util.Random;
import java.util.Random;
public class sum2 {


    public static void main(String[] args) {
        foo2();
    }

/*    static void foo() {

        int i;
        for (i = 23; i < 28; i++) {
            if (i % 13 == 0) {
                System.out.println("continue!");
                continue;
            }
            System.out.println("i is : " + i);
        }
        System.out.println("number is : " + i);
    }*/

    static void foo2() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.println("Average value is: " + array[i]);
        }
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Average sum is: " + sum);

   /*static void foo3(){


       int [][] array = {
               {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
       };

       System.out.println("{");
       for (int [] x : array) {


           System.out.print("{");

           for (int m : x){
               System.out.print(m );
           }
           System.out.println("}");

       }

       System.out.print("}");
   }
*/


    }
}






