package com.sunjinwei.springboot.controller;

import com.sunjinwei.springboot.model.Fine;
import com.sunjinwei.springboot.model.TrafficViolation;
import com.sunjinwei.springboot.model.Violation;
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

        Violation violation = trafficViolation.getViolation();
        kieSession.insert(trafficViolation);
        kieSession.insert(violation);

        Fine fine = new Fine();
        kieSession.insert(fine);

        int ruleFiredCount = kieSession.fireAllRules();

        kieSession.destroy();

        return trafficViolation;
    }


}
