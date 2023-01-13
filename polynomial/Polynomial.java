package epam.practic.polynomial;

import java.util.ArrayList;
import java.util.List;

/*
4. Определить класс Полином степени n. Объявить массив/список/множество
из m полиномов и определить сумму полиномов массива.
 */
public class Polynomial {
    private int value;
    private int powerX;
    private int n;
    private int result;


    public Polynomial(int value, int powerX, int n) {
        this.value = value;
        this.powerX = powerX;
        this.n = n;
    }

    public Polynomial(int result) {
        this.result = result;
    }
    public Polynomial(){

    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPowerX() {
        return powerX;
    }

    public void setPowerX(int powerX) {
        this.powerX = powerX;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Polynomial additional(Polynomial polynomial2) {
        List<Integer> numbersPolynomial = new ArrayList<>();
        int res = 0;

        for (int i = 0; i < n; i++) {
            powerX = (int) Math.pow(powerX, i);
            polynomial2.setPowerX((int) Math.pow(polynomial2.getPowerX(), i));
            numbersPolynomial.add(i, (powerX * value) + polynomial2.getPowerX() * polynomial2.getValue());
            res += numbersPolynomial.get(i);
        }

        return new Polynomial(res);

    }

    @Override
    public String toString() {
        return "Polynomial{" +
                "value=" + value +
                ", powerX=" + powerX +
                ", n=" + n +
                ", result=" + result +
                '}';
    }
}