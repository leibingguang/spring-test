package com.lei.beanfactory.el;

import com.lei.beanfactory.el.entity.Inventor;
import javafx.scene.SubScene;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.util.GregorianCalendar;

public class TestEL {
    public static void main(String[] args) {
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression exp = parser.parseExpression("'Hello World'");
//        String message = (String) exp.getValue();

//        ExpressionParser parser = new SpelExpressionParser();
////        Expression exp = parser.parseExpression("'Hello World'.concat('!')");
////        String message = (String) exp.getValue();
//        Expression exp = parser.parseExpression("'Hello World'.bytes.length");
//        int bytes = (Integer) exp.getValue();
// Create and set a calendar
        GregorianCalendar c = new GregorianCalendar();
        c.set(1856, 7, 9);

// The constructor arguments are name, birthday, and nationality.
        Inventor tesla = new Inventor("Nikola Tesla", c.getTime(), "Serbian");

        ExpressionParser parser = new SpelExpressionParser();

        Expression exp = parser.parseExpression("name");
        String name = (String) exp.getValue(tesla);
        System.out.println(name);
// name == "Nikola Tesla"

        exp = parser.parseExpression("nationality == 'Nikola Tesla'");
        boolean result = exp.getValue(tesla, Boolean.class);
// result == true
//        System.out.println(bytes);
        System.out.println(result);
    }
}
