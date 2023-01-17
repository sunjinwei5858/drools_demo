package com.sunjinwei.entity;

/**
 * @program: com.sunjinwei.entity
 * @author: sun jinwei
 * @create: 2023-01-17 08:25
 * @description:
 **/
public class Order {

    // 金额
    private int amount;

    // 积分
    private int score;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}