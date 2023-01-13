package epam.practic.polynomial;

import java.util.ArrayList;

public class Calculation {
    public static void main(String[] args) {
        Polynomial polynomial = new Polynomial(2, 3, 5);
        Polynomial[] polynomials = new Polynomial[5];
        for (int i = 0; i < polynomial.getN(); i++) {
            polynomials[i] = new Polynomial(2, 3, 5);
            System.out.println(polynomial.additional(polynomials[i]));
        }

    }
}
