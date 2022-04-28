package org.joksin.quarkussamples.conditional;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

@Slf4j
@ApplicationScoped
public class PrinterInitializer {

    @ConfigProperty(name = "app.printer.type")
    private String printerType;

    @Produces
    public Printer printer() {
        log.info("Initializing Printer bean");
        switch (printerType) {
            case "printerA": return new PrinterA();
            case "printerB": return new PrinterB();
            default: throw new RuntimeException("Not supported printer type " + printerType);
        }
    }

}
