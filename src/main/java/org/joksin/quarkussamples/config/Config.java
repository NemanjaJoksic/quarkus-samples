package org.joksin.quarkussamples.config;

import lombok.Getter;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.inject.Singleton;

@Getter
@Singleton
public class Config {

    @ConfigProperty(name = "app.property1")
    private String appProperty1;

    @ConfigProperty(name = "app.property2")
    private String appProperty2;

    @ConfigProperty(name = "app.property3")
    private String appProperty3;

}
