package com.project.time.services;

import org.springframework.stereotype.Service;

import com.project.time.entities.Time;

@Service
public class TimeService {
    
    public Time getTime(){
        
        return Time.builder().time("Now-1")
        .currentTime(System.currentTimeMillis()).build();
        
    }
}
