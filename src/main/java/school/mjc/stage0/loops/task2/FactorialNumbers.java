package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int n) {
        long fac = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                fac = 1;
            } else {
                fac *= i;
            }
            System.out.println(fac);
        }
    }
}
