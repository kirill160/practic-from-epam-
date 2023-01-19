package epam.practic.interval;

public class TestInterval {
    public static void main(String[] args) throws IntervalNotFoundException {
        Interval interval = new Interval(1, 7, 2, 6);
        Interval interval2 = new Interval(8, 14, 9, 13);
        interval.createNumbersIntervals(interval2);
        System.out.println(interval.combiningIntervals(interval2));
        System.out.println(interval.intervalCrossing(interval2));

    }
}
