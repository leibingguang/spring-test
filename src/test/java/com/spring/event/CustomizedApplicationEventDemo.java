package com.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.EventListener;
import org.springframework.context.support.GenericApplicationContext;

/**
 * 自定义事件
 *
 * @author leibingguang
 * @since 3/28/21 5:49 PM
 */
public class CustomizedApplicationEventDemo {

    public static void main(String[] args) {
        // 初始化应用上下文
        GenericApplicationContext context  = new GenericApplicationContext();
        // 注册时间监听器
        context.addApplicationListener(new MyApplicationListener());
        // 启动应用上下文
        context.refresh();
        //发布自定义事件
        context.publishEvent(new MyApplicationEvent(context));
        //关闭应用上下文
        context.close();
    }

    static class MyApplicationEvent extends ApplicationContextEvent
    {
        public MyApplicationEvent(ApplicationContext source) {
            super(source);
        }
    }

    static class MyApplicationListener implements ApplicationListener<MyApplicationEvent>
    {
        @Override
        public void onApplicationEvent(MyApplicationEvent event) {
            System.out.println("自定义事件： " + event);
        }
    }
}
