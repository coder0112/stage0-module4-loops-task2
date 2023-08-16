package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int n) {
        for (int i = 0; i <= Math.abs(n); i++) {
            if (n != 0) {
                System.out.println(i * n);
            }
        }
    }
}
