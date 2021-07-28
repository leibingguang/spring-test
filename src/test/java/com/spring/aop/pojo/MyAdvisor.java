//package com.spring.aop.pojo;
//
//import org.aopalliance.aop.Advice;
//import org.springframework.aop.*;
//
//import java.lang.reflect.Method;
//
//public class MyAdvisor implements PointcutAdvisor {
//    @Override
//    public Pointcut getPointcut() {
//        return new Pointcut() {
//            @Override
//            public ClassFilter getClassFilter() {
//                return ClassFilter.TRUE;
//            }
//
//            @Override
//            public MethodMatcher getMethodMatcher() {
//                return new MethodMatcher() {
//                    @Override
//                    public boolean matches(Method method, Class<?> targetClass) {
//                        String methodName = method.getName();
//                        System.out.println("MyAdvisor matches, methodName=" + methodName + " targetClass=" + targetClass);
//                        return true;
//                    }
//
//                    @Override
//                    public boolean isRuntime() {
//                        return false;
//                    }
//
//                    @Override
//                    public boolean matches(Method method, Class<?> targetClass, Object... args) {
//                        String methodName = method.getName();
//                        System.out.println("MyAdvisor matches with args, methodName="  + methodName + " targetClass=" + targetClass + " args=" + args);
//                        return true;
//                    }
//                };
//            }
//        };
//
//    }
//
//    @Override
//    public Advice getAdvice() {
//        MethodBeforeAdvice methodBeforeAdvice = (method, args, target)-> System.out.println("MyAdvisor before advise, method = " + method);
//        return methodBeforeAdvice;
//    }
//
//    @Override
//    public boolean isPerInstance() {
//        return true;
//    }
//}
