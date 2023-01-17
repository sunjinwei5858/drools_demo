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

    @Data
    public static class Driver {

        @JsonProperty("Points")
        private int points;

    }

    @Data
    public static class Violation {

        @JsonProperty("Type")
        private String type;

        @JsonProperty("Actual Speed")
        private int actualSpeed;

        @JsonProperty("Speed Limit")
        private int speedLimit;
    }

    @Data
    public static class Fine {

        @JsonProperty("Points")
        private int points;

        @JsonProperty("Amount")
        private int amount;
    }

}
