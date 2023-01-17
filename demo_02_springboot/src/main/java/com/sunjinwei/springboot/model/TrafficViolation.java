package com.sunjinwei.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @author jinwei.sun
 */
@Data
public class TrafficViolation {

    @JsonProperty("Driver")
    private Driver driver;

    @JsonProperty("Violation")
    private Violation violation;

    @JsonProperty("Fine")
    private Fine fine;

    @JsonProperty("Should the driver be suspended?")
    private String suspended;


}
