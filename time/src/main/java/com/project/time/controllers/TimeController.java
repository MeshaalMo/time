package com.project.time.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.time.entities.Time;
import com.project.time.services.TimeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class TimeController {

    private final TimeService timeService;

    @GetMapping("/")
    public Time getTime() {
        return timeService.getTime();
    }
}
