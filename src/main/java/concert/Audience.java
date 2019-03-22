package concert;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Audience {

    @Before("execution(* concert.Performance.perform(..))")
    public void silenceCellPhones()
    {
        System.out.println("Silencing cell phones");
    }

    @Before("execution(* concert.Performance.perform(..))")
    public void takeSeats()
    {
        System.out.println("take Seats");
    }

    @AfterReturning("execution(* concert.Performance.perform(..))")
    public void applause()
    {
        System.out.println("CLAP! CLAP!");
    }

    @AfterThrowing("execution(* concert.Performance.perform(..))")
    public void demandRefund()
    {
        System.out.println("Demading a refund");
    }
}
