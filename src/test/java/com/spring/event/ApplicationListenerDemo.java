package com.spring.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 *  Spring ApplicationListener 事件
 *
 *  1. 接口实现
 *  2. 注解实现
 *  3. 异步特性
 *  4. 有序性
 *
 * @author leibingguang
 * @since 3/28/21 2:07 PM
 */
@EnableAsync
public class ApplicationListenerDemo implements ApplicationEventPublisherAware {
    public static void main(String[] args) {
//        GenericApplicationContext context = new GenericApplicationContext();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ApplicationListenerDemo.class);
        //实现方式：方法一：通过接口实现EventListener事件监听
        //注册方式：方法一： 基于ConfigurableApplicationContext API方式实现注册
        context.addApplicationListener((event)->{
            printLine("ApplicationListener 接口实现 " + event);
        });

        //实现方式： 方法二：通过@EventListener注解实现


        //注册方式：方法二：基于Bean的方式实现
        context.register(MyApplicationEvent.class);

        // 发布事件
        context.refresh();
        context.start();
        context.stop();

    }

    static class MyApplicationEvent implements ApplicationListener<ContextRefreshedEvent>
    {
        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            printLine("自定义 ApplicationListener 接口实现： 通过注册Bean实现");
        }
    }

    // 方法二： 通过@EventListener 注解实现
    @EventListener
    public void onApplicationEvent(ApplicationEvent event)
    {
        printLine("@EventListener 注解事件：" + event);
    }

    // ContextRefreshedEvent事件
    @EventListener
    public void onApplicationRefreshedEvent(ContextRefreshedEvent event)
    {
        printLine("ContextRefreshedEvent 注解事件：");
    }
    // ContextRefreshedEvent 事件
    @EventListener
    public void onApplicationStartedEvent(ContextRefreshedEvent event)
    {
        printLine("ContextRefreshedEvent 注解事件：");
    }

    // ContextStoppedEvent 事件
    @EventListener
    public void onApplicationStopedEvent(ContextStoppedEvent event)
    {
        printLine("ContextStoppedEvent 注解事件： ");
    }

    // ContextStoppedEvent 事件， 异步执行
    @EventListener
    @Async
    public void onApplicationEventAsync(ContextStoppedEvent event)
    {
        printLine("ContextStoppedEvent 异步执行Stop 注解事件" );
    }
    
    private static void printLine(String message)
    {
        System.out.println(("线程：" + Thread.currentThread().getName() + " " + message));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        applicationEventPublisher.publishEvent(new ApplicationEvent("Hello, World"){});
    }
}
