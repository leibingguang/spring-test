import com.lei.beanfactory.TestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import java.lang.annotation.Target;

public class ResourceTest {

    @Test
    public void testClassPathResourcePath() throws Exception {

        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        int i= new XmlBeanDefinitionReader(beanFactory).loadBeanDefinitions(
                new ClassPathResource("applicationContext.xml", getClass()));
        TestBean testBean = (TestBean) beanFactory.getBean("testBean");
        System.out.println(testBean.getTestStr());
    }
}
