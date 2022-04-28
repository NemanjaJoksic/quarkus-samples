package org.joksin.quarkussamples.hello;

import javax.inject.Singleton;

@Singleton
public class HelloServiceImpl implements HelloService {

    @Override
    public HelloMessage sayHello(String name) {
        return new HelloMessage(name);
    }

}
