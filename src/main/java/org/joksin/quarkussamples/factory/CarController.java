package org.joksin.quarkussamples.factory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class CarController {

    private final CarFactory carFactory;

    public CarController(CarFactory carFactory) {
        this.carFactory = carFactory;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/cars")
    public Response getCar(@QueryParam("type") String type) {
        Car car = carFactory.getCar(type);
        if (car == null) {
            return Response.noContent().build();
        } else {
            return Response.ok(car).build();
        }
    }

}
