package com.pluralsight.singleton;

public class DbSingleton {

    private static volatile DbSingleton instance = null;

    private DbSingleton(){

    }

    public static DbSingleton getInstance(){
        if(null == instance) {
            synchronized (DbSingleton.class) {
                if(null == instance) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
