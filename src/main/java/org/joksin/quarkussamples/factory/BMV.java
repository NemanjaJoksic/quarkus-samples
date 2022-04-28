package org.joksin.quarkussamples.factory;

import javax.inject.Named;
import javax.inject.Singleton;

@Singleton
@Named(Car.BMV)
public class BMV implements Car {

    @Override
    public String getName() {
        return "BMV";
    }

}
