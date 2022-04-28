package org.joksin.quarkussamples.hello;

import lombok.Getter;

@Getter
public class HelloMessage {

    private String message;

    public HelloMessage(String name) {
        this.message = "Hello " + name + "!";
    }

}
