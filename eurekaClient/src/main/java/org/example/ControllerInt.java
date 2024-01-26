package org.example;

import org.springframework.web.bind.annotation.RequestMapping;

public interface ControllerInt {
    @RequestMapping("/greeting")
    String greeting();
}
