package com.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author leibingguang
 * @since 3/28/21 5:08 PM
 */
@Configuration
public class HierachicalSpringEventPropagateDemo {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext parent = new AnnotationConfigApplicationContext();
        parent.setId("parent-context");
        parent.register(MyListener.class);

        AnnotationConfigApplicationContext child = new AnnotationConfigApplicationContext();
        child.setId("child-context");
        child.setParent(parent);
        child.register(MyListener.class);

        // 启动应用上下文
        parent.refresh();
        child.refresh();

        //关闭应用上下文
        child.close();
        parent.close();
    }

    /**
     * Refresh事件
     */
    static class MyListener implements ApplicationListener<ContextRefreshedEvent> {

        // 通过集合判断达到parent context只执行一次的目的
        // 这里必须要用到static，因为parent和child context各有一个myListener对象
        private static Set<ContextRefreshedEvent> eventSet = new HashSet<>();

        @Override
        public void onApplicationEvent(ContextRefreshedEvent event) {
            if (eventSet.add(event)) {

                System.out.println("[ ContextRefreshedEvent 事件 ] contextId = " + event.getApplicationContext().getId());
            }
        }
    }
}
