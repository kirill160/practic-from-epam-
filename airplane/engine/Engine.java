package epam.practic.airplane.engine;

import java.util.Objects;

public class Engine {
    private String name;
    private int power;
    private int numberOfCylinders;

    public Engine(String name, int power, int numberOfCylinders) {
        this.name = name;
        this.power = power;
        this.numberOfCylinders = numberOfCylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfCylinders() {
        return numberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        this.numberOfCylinders = numberOfCylinders;
    }

    public void start(){
        System.out.println("двигатель работает");
    }
    public void stop(){
        System.out.println("двигатель остановился");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Engine)) return false;
        Engine engine = (Engine) o;
        return getPower() == engine.getPower() && getNumberOfCylinders() == engine.getNumberOfCylinders() && Objects.equals(getName(), engine.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPower(), getNumberOfCylinders());
    }

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", numberOfCylinders=" + numberOfCylinders +
                '}';
    }
}
