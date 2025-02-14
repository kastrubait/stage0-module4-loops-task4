package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if ( lastInRow < 0 ) {
            System.out.println("last number in row is negative");
        } else {
            int sumSkip = 0;
            int sumCount = 0;
            int counter = 0;
            do {
                if (counter <= numberToSkip) {
                    sumSkip += counter;
                } else {
                    sumCount += counter;
                }
                counter++;
            } while (numberToSkip <= lastInRow && counter <= lastInRow);
            if (numberToSkip > lastInRow) {
                System.out.println("number to skip is bigger then the last");
            } else {
                System.out.println("skipped sum is " + sumSkip);
                System.out.println("counted sum is " + sumCount);
            }
        }
    }
}
