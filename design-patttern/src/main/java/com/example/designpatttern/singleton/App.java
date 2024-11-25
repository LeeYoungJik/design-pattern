package com.example.designpatttern.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Settings settings = Settings.INSTANCE;

        Settings settings1 = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings == settings1);


        /*
        Settings settings = Settings.INSTANCE;


        Settings settings1 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors(); //선호되는 모든 생성체를 다 가져오게 한 다움에

        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            settings1 = (Settings)constructor.newInstance("INSTANCE");
        }

        System.out.println(settings == settings1);

*/







        /*
        Settings settings = Settings.getInstance();
        Settings settings1 = null;
        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))){
            out.writeObject(settings);
        }

        try(ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))){
            settings1 = (Settings) in.readObject();
        }

        System.out.println(settings == settings1);
        */

/*
        Settings settings = Settings.INSTANCE;
        // settings라는 타입의 인스턴스가 얼마든지 만들어 질 수 있다.
//        Settings settings1 = Settings.getInstance();

        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();  // new를 이용해서 생성자를 호출한거라면 다른 객체를 호출한거다. 그래서 같냐고 비교하면 False가 된다.
        // 싱글톤을 꺠트리는 첫 번째 방법

        //직렬화 , 역질렬화

        //자바에는

        System.out.println(System.identityHashCode(settings));
        System.out.println(System.identityHashCode(settings1) );

        System.out.println(settings == settings1);


*/


    }
}
