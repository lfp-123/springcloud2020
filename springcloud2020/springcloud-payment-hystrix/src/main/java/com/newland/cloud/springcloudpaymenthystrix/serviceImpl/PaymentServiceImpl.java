package com.newland.cloud.springcloudpaymenthystrix.serviceImpl;


        import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
        import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
        import org.springframework.stereotype.Service;

        import java.util.concurrent.TimeUnit;

/**
 * @author ${linfengpeng}
 * @Title: PaymentServiceImpl
 * @ProjectName springcloud2020
 * @Description: TODO
 * @date 2020/10/13 13:53
 */
@Service
public class PaymentServiceImpl {
    public String paymentInfo_OK(Integer id){

        return "线程池："+Thread.currentThread().getName()+"payment_ok"+id+"  success!!";

    }
    @HystrixCommand(fallbackMethod = "paymentInfoTimeoutHandle",commandProperties = {
         //   @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "3000"),
            @HystrixProperty(name = "circuitBreaker.enabled",value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value ="10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value = "60")
    })
    public String paymentInfo_Timeout(Integer id){
        int timeNumber = 5;
        try {
            int age =  10/0;
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id: "+id+" 耗时3秒种  ";
    }

    public String paymentInfoTimeoutHandle(Integer id){
        return "线程池： "+Thread.currentThread().getName()+"id:"+id+"我是补救的方法";
    }

}
