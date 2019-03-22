package concert;

import org.springframework.stereotype.Component;

@Component
public class MusicPerformance implements Performance {
    public void perform() throws Exception {
        System.out.println("music...");
        if(true)
        {
            throw new Exception();
        }
    }
}
