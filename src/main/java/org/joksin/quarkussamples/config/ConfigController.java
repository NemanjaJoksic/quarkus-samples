package org.joksin.quarkussamples.config;

import com.google.common.collect.ImmutableMap;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Map;

@Path ("/")
public class ConfigController {

    private final Config config;

    public ConfigController(Config config) {
        this.config = config;
    }

    @GET
    @Produces (MediaType.APPLICATION_JSON)
    @Path("/config")
    public Map<String, Object> getConfig() {
        return ImmutableMap.of(
                "app.property1", config.getAppProperty1(),
                "app.property2", config.getAppProperty2(),
                "app.property3", config.getAppProperty3()
        );
    }

}
