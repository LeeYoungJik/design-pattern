package com.example.designpatttern.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringExample {

    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);

        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);

        System.out.println("hello = "+hello);
        System.out.println(hello==hello2); //항상 같은 인스턴스라고 표출된다.
        //singtone scope이라고 부르낟.
        //application 안에서 SingtoneScope으로 쓴다.
        //얼마든지 domain object에 구현할때 써도 된다.


    }
}
