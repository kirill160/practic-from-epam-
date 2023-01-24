package epam.practic.airplane.wing;

import java.util.Objects;

public class Wing {
    private String model;
    private int counterWing;

    public Wing(String model, int counterWing) {
        this.model = model;
        this.counterWing = counterWing;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCounterWing() {
        return counterWing;
    }

    public void setCounterWing(int counterWing) {
        this.counterWing = counterWing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wing)) return false;
        Wing wing = (Wing) o;
        return getCounterWing() == wing.getCounterWing() && Objects.equals(getModel(), wing.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getCounterWing());
    }

    @Override
    public String toString() {
        return "Wing{" +
                "model='" + model + '\'' +
                ", counterWing=" + counterWing +
                '}';
    }
}
