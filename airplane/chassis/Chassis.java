package epam.practic.airplane.chassis;

import epam.practic.airplane.interfce.actionable.Actionable;
import java.util.Objects;

public class Chassis implements Actionable {
    private int numbersWheel;
    private int radius;

    public Chassis(int numbersWheel, int radius){
        this.numbersWheel = numbersWheel;
        this.radius = radius;
    }

    @Override
    public void action() {
        System.out.println("шаси едет");
    }

    @Override
    public void breakAction() {
        System.out.println("шасси тормозит");
    }

    public int getNumbersWheel() {
        return numbersWheel;
    }

    public void setNumbersWheel(int numbersWheel) {
        this.numbersWheel = numbersWheel;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chassis)) return false;
        Chassis chassis = (Chassis) o;
        return getNumbersWheel() == chassis.getNumbersWheel() && getRadius() == chassis.getRadius();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumbersWheel(), getRadius());
    }

    @Override
    public String toString() {
        return "Chassis{" +
                "numbersWheel=" + numbersWheel +
                ", radius=" + radius +
                '}';
    }


}
