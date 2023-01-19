package epam.practic.interval;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*
Определить класс Интервал с учетом включения/невключения концов.
Создать методы по определению пересечения и объединения интервалов,
причем интервалы, не имеющие общих точек, пересекаться/объединятся не
могут. Объявить массив/список/множество и n интервалов и определить
расстояние между самыми удаленными концами.
 */
public class Interval {
    private int pointA;
    private int pointB;
    private int initialValueOfSegment;
    private int segmentEndValue;
    private List<Integer> intervalValues;

    public Interval(int pointA, int pointB, int initialValueOfSegment, int segmentEndValue) {
        this.pointA = pointA;
        this.pointB = pointB;
        this.initialValueOfSegment = initialValueOfSegment;
        this.segmentEndValue = segmentEndValue;
        this.intervalValues = new ArrayList<>();


    }

    private Interval(List<Integer> intervalValues) {
        this.intervalValues = intervalValues;
    }

    public Interval() {

    }


    public int getPointA() {
        return pointA;
    }

    public void setPointA(int pointA) {
        this.pointA = pointA;
    }

    public int getPointB() {
        return pointB;
    }

    public void setPointB(int pointB) {
        this.pointB = pointB;
    }

    public List<Integer> getIntervalValues() {
        return intervalValues;
    }

    public void setIntervalValues(List<Integer> intervalValues) {
        this.intervalValues = intervalValues;
    }

    public int getInitialValueOfSegment() {
        return initialValueOfSegment;
    }

    public void setInitialValueOfSegment(int initialValueOfSegment) {
        this.initialValueOfSegment = initialValueOfSegment;
    }

    public int getSegmentEndValue() {
        return segmentEndValue;
    }

    public void setSegmentEndValue(int segmentEndValue) {
        this.segmentEndValue = segmentEndValue;
    }

    public void createNumbersIntervals() throws IntervalNotFoundException {
        for (int i = initialValueOfSegment; i < segmentEndValue; i++) {
            if (initialValueOfSegment == 0 && segmentEndValue == 0) {
                throw new IntervalNotFoundException("start and end value zero");
            }
            if (i >= pointA && i <= pointB) {
                intervalValues.add(i);

            }

        }

    }

    private void createNumberIntervalTwo(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        for (int i = interval2.initialValueOfSegment; i < interval2.segmentEndValue; i++) {
            if (interval2.initialValueOfSegment == 0 && interval2.segmentEndValue == 0) {
                throw new IntervalNotFoundException("start and end value zero");
            }
            if (i >= interval2.pointA && i <= interval2.pointB) {
                interval2.intervalValues.add(i);

            }
        }

    }

    public Interval combiningIntervals(Interval interval2) throws IntervalNotFoundException {
        createNumberIntervalTwo(interval2);
        if (interval2 == null) {
            interval2 = new Interval();
        }
        List<Integer> result = new ArrayList<>();
        result.addAll(intervalValues);
        for (int i = 0; i < intervalValues.size(); i++) {
            if (!intervalValues.get(i).equals(interval2.intervalValues.get(i))) {
                result.add(interval2.intervalValues.get(i));
            }

        }
        return new Interval(result);
    }

    public Interval intervalCrossing(Interval interval2) throws IntervalNotFoundException {
        createNumberIntervalTwo(interval2);
        if (interval2 == null) {
            interval2 = new Interval();
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < intervalValues.size(); i++) {
            if (intervalValues.get(i).equals(interval2.intervalValues.get(i))) {
                result.add(interval2.intervalValues.get(i));
            }

        }
        return new Interval(result);
    }


    @Override
    public String toString() {
        return "Interval{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", initialValueOfSegment=" + initialValueOfSegment +
                ", segmentEndValue=" + segmentEndValue +
                ", intervalValues=" + intervalValues.toString() +
                '}';
    }
}
