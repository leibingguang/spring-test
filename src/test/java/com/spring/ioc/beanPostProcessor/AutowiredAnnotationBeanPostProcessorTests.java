package com.spring.ioc.beanPostProcessor;

import org.junit.Test;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class AutowiredAnnotationBeanPostProcessorTests {

    @Test
    public void testIncompleteBeanDefinition() {
        DefaultListableBeanFactory bf = new DefaultListableBeanFactory();
        AutowiredAnnotationBeanPostProcessor bpp = new AutowiredAnnotationBeanPostProcessor();
        bpp.setBeanFactory(bf);
        bf.addBeanPostProcessor(bpp);
        bf.registerBeanDefinition("testBean", new GenericBeanDefinition());
        try {
            bf.getBean("testBean");
            fail("Should have thrown BeanCreationException");
        }
        catch (BeanCreationException ex) {
            assertTrue(ex.getRootCause() instanceof IllegalStateException);
        }
    }
}
