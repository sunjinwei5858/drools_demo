package com.sunjinwei.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @program: com.sunjinwei.springboot.model
 * @author: sun jinwei
 * @create: 2023-01-17 21:53
 * @description:
 **/
@Data
public class Violation {
    @JsonProperty("Type")
    private String type;

    @JsonProperty("Actual Speed")
    private int actualSpeed;

    @JsonProperty("Speed Limit")
    private int speedLimit;
}