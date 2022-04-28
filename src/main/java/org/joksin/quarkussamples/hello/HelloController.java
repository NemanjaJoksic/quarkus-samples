package org.joksin.quarkussamples.hello;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class HelloController {

    private final HelloService helloService;

    @Inject
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/hello/{name}")
    public HelloMessage hello(@PathParam("name") String name) {
        return helloService.sayHello(name);
    }

}
