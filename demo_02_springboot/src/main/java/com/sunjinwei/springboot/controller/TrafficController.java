package com.sunjinwei.springboot.controller;

import com.sunjinwei.springboot.model.TrafficViolation;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author jinwei.sun
 */
@RestController
public class TrafficController {

    @Resource
    private KieContainer kieContainer;

    @PostMapping("/Traffic Violation")
    public TrafficViolation trafficViolation(@RequestBody TrafficViolation trafficViolation) {

        KieSession kieSession = kieContainer.newKieSession();
        kieSession.insert(trafficViolation);
        return trafficViolation;
    }


}
