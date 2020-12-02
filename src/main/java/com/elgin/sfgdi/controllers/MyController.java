package com.elgin.sfgdi.controllers;

import com.elgin.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

	public String sayHello() {
        return this.greetingService.sayGreeting();
	}
}
