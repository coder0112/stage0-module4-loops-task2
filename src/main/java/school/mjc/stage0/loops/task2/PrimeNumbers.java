package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int n) {

        if (n != 0) {
           for (int i = 2; i <= n; i++) {
               boolean b = true;
               for (int j = 2; j < i; j++) {
                   if (i % j == 0) {
                       b = false;
                       break;
                   }
               }
               if (b == true) {
                   System.out.println(i);
               }
           }
        }
    }
}
