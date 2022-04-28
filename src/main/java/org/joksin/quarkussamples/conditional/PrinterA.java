package org.joksin.quarkussamples.conditional;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrinterA implements Printer {

    @Override
    public void print(String text) {
        log.info("PrinterA is printing text: {}", text);
    }

}
