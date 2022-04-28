package org.joksin.quarkussamples.factory;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named(Car.MERCEDES)
public class Mercedes implements Car {

    @Override
    public String getName() {
        return "mercedes";
    }

}
