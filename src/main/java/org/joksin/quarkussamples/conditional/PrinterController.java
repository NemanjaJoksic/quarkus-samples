package org.joksin.quarkussamples.conditional;

import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class PrinterController {

    private final Printer printer;

    @Inject
    public PrinterController(Printer printer) {
        this.printer = printer;
    }

    @POST
    @Produces (MediaType.APPLICATION_JSON)
    @Path("/print")
    public Response printMessage(Message message) {
        printer.print(message.getText());
        return Response.ok(message).build();
    }

}
