package concert;

import com.lei.beanfactory.test.wire.autowire.CDPlayer;
import com.lei.beanfactory.test.wire.autowire.CompactDisc;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class Test {
    @Autowired
    private Performance performance;

    @org.junit.Test
    public void test() throws Exception {

        performance.perform();
    }
}
