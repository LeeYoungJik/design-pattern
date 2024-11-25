package com.example.designpatttern.singleton;

public class RuntimeExample {

    public static void main(String[]  args){
        Runtime runtime = Runtime.getRuntime();
        //runtime instance는 runtime이 실행하는 환경에 대해서 가져온다.
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());


    }

}
