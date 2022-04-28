package org.joksin.quarkussamples.conditional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrinterB implements Printer {

    @Override
    public void print(String text) {
        log.info("PrinterB is printing text: {}", text);
    }

}
