package com.sunjinwei;

import com.sunjinwei.entity.Order;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @program: com.sunjinwei
 * @author: sun jinwei
 * @create: 2023-01-17 08:38
 * @description:
 **/
public class OrderTest {

    /**
     * 类似mybatis
     */
    @Test
    public void test001() {
        // 第一步：
        KieServices kieServices = KieServices.Factory.get();
        // 第二步
        KieContainer container = kieServices.getKieClasspathContainer();
        // 第三步
        KieSession kieSession = container.newKieSession();
        // 第四步
        // 构建事实对象
        Order order = new Order();
        order.setAmount(234);
        kieSession.insert(order);
        // 第五步: 执行规则引擎 触发规则
        kieSession.fireAllRules();
        // 第六步：关闭session
        kieSession.dispose();

        System.out.println("执行了规则之后 积分为：" + order.getScore());
    }
}