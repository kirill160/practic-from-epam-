package epam.practic.polynomial;

import java.util.ArrayList;
import java.util.List;

/*
4. Определить класс Полином степени n. Объявить массив/список/множество
из m полиномов и определить сумму полиномов массива.
 */
public class Polynomial {
    private int value;
    private int valueX;
    private int n;
    private int result;


    public Polynomial(int value, int valueX, int n) {
        this.value = value;
        this.valueX = valueX;
        this.n = n;
    }

    private Polynomial(int result) {
        this.result = result;
    }

    public Polynomial() {

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPowerX() {
        return valueX;
    }

    public void setPowerX(int valueX) {
        this.valueX = valueX;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Polynomial additional(Polynomial polynomial2) {
        List<Integer> numbersPolynomial = new ArrayList<>();
        int sum = 0;
        int counterPower1 = 0;
        int counterPower2 = 0;
        for (int i = 0; i <= n; i++) {
            int resultPower = (int) Math.pow(valueX, counterPower1++);
            int resultPower2 = (int) Math.pow(polynomial2.valueX,counterPower2++);

            numbersPolynomial.add((resultPower * value) + resultPower2 * polynomial2.value);
            sum += numbersPolynomial.get(i);
        }

        return new Polynomial(sum);

    }

    public Polynomial subtraction(Polynomial polynomial2) {
        List<Integer> numbersPolynomial = new ArrayList<>();
        int sum = 0;
        int counterPower1 = 0;
        int counterPower2 = 0;
        for (int i = 0; i <= n; i++) {
            int calculationPowerNumber = (int) Math.pow(valueX, counterPower1++);
            int calculationPowerNumber2 = (int) Math.pow(polynomial2.valueX, counterPower2++);
            numbersPolynomial.add(calculationPowerNumber * value - calculationPowerNumber2 * polynomial2.value);
            sum += numbersPolynomial.get(i);
        }

        return new Polynomial(sum);
    }

    public Polynomial multiplication(Polynomial polynomial2) {
        List<Integer> numbersPolynomial = new ArrayList<>();
        List<Integer> numbersPolynomial2 = new ArrayList<>();
        int sum = 0;
        int counterPower = 0;
        int counterPower2 = 0;

        for (int i = 0; i <= n; i++) {
           numbersPolynomial.add(value);
           numbersPolynomial2.add(polynomial2.value);
            }

        for (Integer numberPolynomial1 : numbersPolynomial) {
            for (Integer numberPolynomial2 : numbersPolynomial2) {
                int res = numberPolynomial1 * numberPolynomial2 + numberPolynomial1 * (int) Math.pow(valueX, counterPower++ + counterPower2++);
                sum += res;
            }
        }

     return new Polynomial(sum);
    }
    public Polynomial division(Polynomial polynomial2){
        List<Integer> numbersPolynomial = new ArrayList<>();
        List<Integer> numbersPolynomial2 = new ArrayList<>();
        int sum = 0;
        int counterPower1 = 0;
        int counterPower2 = 0;
        for (int i = 0; i <= n; i++) {
            int resultPower = (int) Math.pow(valueX, ++counterPower1);
            int resultPower2 = (int) Math.pow(polynomial2.valueX, ++counterPower2);
            numbersPolynomial.add(resultPower * value);
            numbersPolynomial2.add(resultPower2 * polynomial2.value);
        }
        for (int i = numbersPolynomial.size() - 1; i > 0 ; i--) {
            int res = numbersPolynomial.get(i) / numbersPolynomial2.get(i) * (int) Math.pow(valueX, counterPower1 - counterPower2);
            sum += res;
        }
        return new Polynomial(sum);
    }



    @Override
    public String toString() {
        return "Polynomial{" +
                "value=" + value +
                ", valueX=" + valueX +
                ", n=" + n +
                ", result=" + result +
                '}';
    }
}