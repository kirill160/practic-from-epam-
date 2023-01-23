package epam.practic.interval;

import org.bouncycastle.util.Arrays;

import java.util.ArrayList;
import java.util.List;

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
    private List<Integer> intervalValues;

    public static final int firstElementInterval = 0;

    public Interval(int pointA, int pointB) {
        this.pointA = pointA;
        this.pointB = pointB;
        intervalValues = new ArrayList<>();

    }

    public Interval(int pointA, int pointB, List<Integer> intervalValues) {
        this.pointA = pointA;
        this.pointB = pointB;
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

    public void createNumbersInterval(Interval interval2) throws IntervalNotFoundException {
        for (int i = pointA; i < pointB; i++) {
            if (pointA == 0 && pointB == 0) {
                throw new IntervalNotFoundException("start and end value zero");
            }
            intervalValues.add(i);
        }
        for (int i = interval2.pointA; i < interval2.pointB; i++) {
            if (interval2.pointA == 0 && interval2.pointB == 0) {
                throw new IntervalNotFoundException("start and end value zero");
            }
            interval2.intervalValues.add(i);

        }
    }


//    private void createNumberIntervalTwo(Interval interval2) throws IntervalNotFoundException {
//        if (interval2 == null) {
//            interval2 = new Interval();
//        }
//        for (int i = interval2.pointA; i < interval2.pointB; i++) {
//            if (interval2.pointA == 0 && interval2.pointB == 0) {
//                throw new IntervalNotFoundException("start and end value zero");
//            }
//                interval2.intervalValues.add(i);
//
//        }
//    }

    public Interval combiningIntervals(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        //createNumberIntervalTwo(interval2);
        createNumbersInterval(interval2);


        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < intervalValues.size(); j++) {
            for (int i = 0; i < interval2.intervalValues.size(); i++) {
                if (intervalValues.get(j).equals(interval2.intervalValues.get(i))) {
                    result.add(interval2.intervalValues.get(i));
                }

            }
        }
        return new Interval(result.get(firstElementInterval), result.get(result.size() - 1), result);

    }

    public Interval intervalCrossing(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        createNumbersInterval(interval2);

        List<Integer> result = new ArrayList<>(intervalValues);
        for (int i = 0; i < intervalValues.size(); i++) {
            for (int j = 0; j < interval2.intervalValues.size(); j++) {
                if (intervalValues.get(i).equals(interval2.intervalValues.get(j))) {
                    result.remove(intervalValues.get(i));
                }

            }
        }
        return new Interval(result.get(firstElementInterval), result.get(result.size()-1), result);
    }

    public Interval additionalIntervals(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        createNumbersInterval(interval2);
        List<Integer> result = new ArrayList<>();

        int firstValue = intervalValues.get(firstElementInterval) + interval2.intervalValues.get(firstElementInterval);
        int lastValue = intervalValues.size() + interval2.intervalValues.size();

        for (int i = firstValue; i < lastValue; i++) {
            result.add(i);
        }
        return new Interval(firstValue, lastValue, result);
    }

    public Interval subtractionIntervals(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }

        createNumbersInterval(interval2);
        List<Integer> result = new ArrayList<>();

        int firstValue = intervalValues.get(firstElementInterval) - interval2.intervalValues.size();
        int lastValue = intervalValues.size() - interval2.intervalValues.get(firstElementInterval);

        for (int i = firstValue; i < lastValue; i++) {
            result.add(i);
        }


        return new Interval(firstValue, lastValue, result);
    }

    public Interval multiplicationIntervals(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        createNumbersInterval(interval2);
        List<Integer> listForCalculation = new ArrayList<>();
        listForCalculation.add(Math.min(intervalValues.get(firstElementInterval) * interval2.intervalValues.get(firstElementInterval), intervalValues.get(firstElementInterval) * interval2.intervalValues.size()));
        listForCalculation.add(Math.min(intervalValues.size() * interval2.intervalValues.get(firstElementInterval), intervalValues.size() * interval2.intervalValues.size()));
        listForCalculation.add(Math.max(intervalValues.get(firstElementInterval) * interval2.intervalValues.get(firstElementInterval), intervalValues.get(firstElementInterval) * interval2.intervalValues.size()));
        listForCalculation.add(Math.max(intervalValues.size() * interval2.intervalValues.get(firstElementInterval), intervalValues.size() * interval2.intervalValues.size()));

        int resMin = 0;
        for (Integer value : listForCalculation) {
            if (value < resMin) {
                resMin = value;
            }
        }
        int resMax = 0;
        for (Integer value : listForCalculation) {
            if (value > resMax) {
                resMax = value;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = resMin; i < resMax; i++) {
            result.add(i);
        }
        return new Interval(resMin, resMax, result);
    }

    public Interval divisionIntervals(Interval interval2) throws IntervalNotFoundException {
        if (interval2 == null) {
            interval2 = new Interval();
        }
        createNumbersInterval(interval2);
        List<Integer> listForCalculation = new ArrayList<>();
        listForCalculation.add(Math.min(intervalValues.get(firstElementInterval) / interval2.intervalValues.get(firstElementInterval), intervalValues.get(firstElementInterval) / interval2.intervalValues.size()));
        listForCalculation.add(Math.min(intervalValues.size() * interval2.intervalValues.get(firstElementInterval), intervalValues.size() * interval2.intervalValues.size()));
        listForCalculation.add(Math.max(intervalValues.get(firstElementInterval) / interval2.intervalValues.get(firstElementInterval), intervalValues.get(firstElementInterval) / interval2.intervalValues.size()));
        listForCalculation.add(Math.max(intervalValues.size() * interval2.intervalValues.get(firstElementInterval), intervalValues.size() * interval2.intervalValues.size()));

        int resMin = 0;
        for (Integer value : listForCalculation) {
            if (value < resMin) {
                resMin = value;
            }
        }
        int resMax = 0;
        for (Integer value : listForCalculation) {
            if (value > resMax) {
                resMax = value;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = resMin; i < resMax; i++) {
            result.add(i);
        }

        return new Interval(resMin, resMax, result);
    }


    @Override
    public String toString() {
        return "Interval{" +
                "pointA=" + pointA +
                ", pointB=" + pointB +
                ", intervalValues=" + intervalValues +
                '}';
    }
}
