package com.example.designpatttern.singleton;

import java.io.Serializable;




public enum Settings {

    INSTANCE;

}


/*public class Settings implements Serializable {

    private Settings(){}

    private static class SettingsHolder {
        private static  final Settings INSTANCE = new Settings();
    }

    public static  Settings getInstance(){
        return SettingsHolder.INSTANCE;
    }

    protected Object readResolve(){   // 직렬화 객체이고 이 이름을 가진 메소드를 가지고 있다면, 직렬화시에
        return getInstance();
    }


}*/
