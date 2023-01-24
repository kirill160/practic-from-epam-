package epam.practic.airplane.test;

import epam.practic.airplane.Wing;
import epam.practic.airplane.chassis.Chassis;
import epam.practic.airplane.engine.Engine;
import epam.practic.airplane.plane.Plane;

public class TestPlane {
    public static void main(String[] args) {
        Plane plane = new Plane("airbus", new Chassis(2, 10), new Engine("V16", 1200, 16), "Минск - Москва", new Wing("пассажирские", 2));
        plane.setRoute("Москва - Минск");
        plane.checkWind();
        plane.action();
        plane.breakAction();
        System.out.println(plane.getRoute());
    }
}
