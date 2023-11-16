package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if ( lastInRow < 0 ) {
            System.out.println("last number in row is negative");
        } else {
            int sumSkip = 0;
            int sumCount = 0;
            for (int i = 1; i <= lastInRow; i++) {
                if (numberToSkip > lastInRow) System.out.println("number to skip is bugger then the last");
                if (i % numberToSkip == 0) {
                    sumSkip += i;
                } else {
                    sumCount += i;
                }
            }
            System.out.println("counted sum is" + sumSkip);
            System.out.println("counted sum is" + sumCount);
        }
    }
}
