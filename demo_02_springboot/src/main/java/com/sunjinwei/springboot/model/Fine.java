package com.sunjinwei.springboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * @program: com.sunjinwei.springboot.model
 * @author: sun jinwei
 * @create: 2023-01-17 21:54
 * @description:
 **/
@Data
public class Fine {

    @JsonProperty("Points")
    private int points;

    @JsonProperty("Amount")
    private int amount;
}