package org.joksin.quarkussamples.factory;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
public class CarFactory {

    private final Car mercedes;
    private final Car bmv;

    public CarFactory(@Named(Car.MERCEDES) Car mercedes, @Named(Car.BMV) Car bmv) {
        this.mercedes = mercedes;
        this.bmv = bmv;
    }

    public Car getCar(String type) {
        switch (type) {
            case Car.MERCEDES:
                return mercedes;
            case Car.BMV:
                return bmv;
            default:
                return null;
        }
    }

}
