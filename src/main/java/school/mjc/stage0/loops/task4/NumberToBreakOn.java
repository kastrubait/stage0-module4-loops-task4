package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        if (toBreakWith < numberToGoUntil) {
            for (int i = toBreakWith; i <= numberToGoUntil; i++ ) {
                System.out.println(i);
            }
        } else {
            for (int i = toBreakWith; i <= numberToGoUntil; i-- ) {
                System.out.println(i);
            }
        }

    }
}
