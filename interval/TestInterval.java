package epam.practic.interval;

public class TestInterval {
    public static void main(String[] args) throws IntervalNotFoundException {
        Interval[] intervals = {new Interval(1, 7, 2, 6), new Interval(8,14,9,13), new Interval(10, 22, 17, 21)};
        Interval interval2 = new Interval(8, 14, 9, 13);
        for (int i = 0; i < intervals.length; i++) {
            intervals[i].createNumbersIntervals();
            System.out.println(intervals[i].combiningIntervals(interval2));
            System.out.println(intervals[i].intervalCrossing(interval2));
            System.out.println(intervals[i].additionalIntervals(interval2));
            System.out.println(intervals[i].subtractionIntervals(interval2));
            System.out.println(intervals[i].divisionIntervals(interval2));
            System.out.println(intervals[i].multiplicationIntervals(interval2));

        }

    }
}
