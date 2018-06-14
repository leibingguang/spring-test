package com.lei.beanfactory.el;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        Simple simple = new Simple();
        simple.booleanList.add(true);

        EvaluationContext context = new SimpleEvaluationContext.Builder().build().forReadOnlyDataBinding().build();

        ExpressionParser parser = new SpelExpressionParser();

// false is passed in here as a string. SpEL and the conversion service will
// correctly recognize that it needs to be a Boolean and convert it
//        parser.parseExpression("booleanList[0]").setValue(context, simple, "false");
        System.out.println(parser.parseExpression("booleanList[0]").getValue(context,simple));

// b will be false
        Boolean b = simple.booleanList.get(0);
        System.out.println(b);
    }
}

class Simple {
    public List<Boolean> booleanList = new ArrayList<Boolean>();
}