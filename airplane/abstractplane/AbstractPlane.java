package epam.practic.airplane.abstractplane;

import epam.practic.airplane.Wing;
import epam.practic.airplane.chassis.Chassis;
import epam.practic.airplane.engine.Engine;
import epam.practic.airplane.interfce.actionable.Actionable;

import java.util.Objects;

public abstract class AbstractPlane implements Actionable {
    protected  String name;
    protected Chassis chassis;
    protected Engine engine;
    protected String route;
    protected Wing wing;

    public AbstractPlane(String name, Chassis chassis, Engine engine, String route, Wing wing) {
        this.name = name;
        this.chassis = chassis;
        this.engine = engine;
        this.route = route;
        this.wing = wing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public void action() {
        System.out.println("самолёт " + name + " летит");

    }

    @Override
    public void breakAction() {
        System.out.println("самолёт " + name + " остановился");
    }
    public void checkWind(){
        if (wing.getCounterWing() != 2){
            throw new RuntimeException("крыльев " + wing.getCounterWing());
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractPlane)) return false;
        AbstractPlane that = (AbstractPlane) o;
        return Objects.equals(getName(), that.getName()) && Objects.equals(getChassis(), that.getChassis()) && Objects.equals(getEngine(), that.getEngine()) && Objects.equals(getRoute(), that.getRoute()) && Objects.equals(getWing(), that.getWing());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getChassis(), getEngine(), getRoute(), getWing());
    }
}
