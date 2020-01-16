package com.spring.aop.aspectJWithXml;

import java.util.List;
import java.util.Set;

public interface Performance {
    void perform();
    String testArgs(List<String> list1);
    void testSet(Set<String> stringSet);

    void testSet(String str, Set<String> stringSet);
}
