package com.sunjinwei.springboot.controller;

import com.sunjinwei.springboot.model.Address;
import com.sunjinwei.springboot.model.fact.AddressCheckResult;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@RequestMapping("/test")
@Controller
public class TestController {

    @Resource
    private KieContainer kieContainer;

    @ResponseBody
    @RequestMapping("/address")
    public void test(int num) {
        Address address = new Address();
        address.setPostcode(String.valueOf(num));
        KieSession kieSession = kieContainer.newKieSession();

        AddressCheckResult result = new AddressCheckResult();
        kieSession.insert(address);
        kieSession.insert(result);
        int ruleFiredCount = kieSession.fireAllRules();
        kieSession.destroy();
        System.out.println("触发了" + ruleFiredCount + "条规则");

        if (result.isPostCodeResult()) {
            System.out.println("规则校验通过");
        }

    }
}
