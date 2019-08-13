package com.spring.aop.aspectJ;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AspectJConfig.class)
public class AspectJDemo {
    @Autowired
    private Performance performance;

    @Test
    public void testAspectJ()
    {
        performance.perform();
    }
}
