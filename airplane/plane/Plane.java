package epam.practic.airplane.plane;

import epam.practic.airplane.Wing;
import epam.practic.airplane.abstractplane.AbstractPlane;
import epam.practic.airplane.chassis.Chassis;
import epam.practic.airplane.engine.Engine;

public class Plane extends AbstractPlane {
    public Plane(String name, Chassis chassis, Engine engine, String route, Wing wing) {
        super(name, chassis, engine, route, wing);
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Chassis getChassis() {
        return super.getChassis();
    }

    @Override
    public void setChassis(Chassis chassis) {
        super.setChassis(chassis);
    }

    @Override
    public Engine getEngine() {
        return super.getEngine();
    }

    @Override
    public void setEngine(Engine engine) {
        super.setEngine(engine);
    }

    @Override
    public String getRoute() {
        return super.getRoute();
    }

    @Override
    public void setRoute(String route) {
        super.setRoute(route);
    }

    @Override
    public Wing getWing() {
        return super.getWing();
    }

    @Override
    public void setWing(Wing wing) {
        super.setWing(wing);
    }

    @Override
    public void action() {
        super.action();
    }

    @Override
    public void breakAction() {
        super.breakAction();
    }

    @Override
    public void checkWind() {
        super.checkWind();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
