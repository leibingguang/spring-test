package com.lei.beanfactory.el;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TypeTest {
    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();

        Class dateClass = parser.parseExpression("T(java.util.Date)").getValue(Class.class);
        System.out.println(dateClass);
    }
}
