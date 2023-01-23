package epam.practic.interval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestInterval {


    public static void main(String[] args) throws IntervalNotFoundException {
        List<Interval> intervalList = new ArrayList<>(Arrays.asList(new Interval(1, 7), new Interval(8, 14), new Interval(20, 26)));
        List<Interval> intervalList2 = new ArrayList<>(Arrays.asList(new Interval(2, 8), new Interval(9, 15), new Interval(21, 27)));
        for (int i = 0; i < intervalList.size(); i++) {
            System.out.println(intervalList.get(i).combiningIntervals(intervalList2.get(i)));
            System.out.println(intervalList.get(i).intervalCrossing(intervalList2.get(i)));
            System.out.println(intervalList.get(i).additionalIntervals(intervalList2.get(i)));
            System.out.println(intervalList.get(i).subtractionIntervals(intervalList2.get(i)));
            System.out.println(intervalList.get(i).divisionIntervals(intervalList2.get(i)));
            System.out.println(intervalList.get(i).multiplicationIntervals(intervalList2.get(i)));

        }

    }
}
