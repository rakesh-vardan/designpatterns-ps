package com.pluralsight.singleton;

/*
Example for simple Singleton implementation with lazy loaded & not thread safe
*/
public class DbSingletonLazyLoaded {

    //private static instance so that the application can get only once instance of an object

    private static DbSingletonLazyLoaded instance = null;

    //private constructor so that no one else can create an instance of this class

    private DbSingletonLazyLoaded(){}

    //public method to call the only instance that is created by singleton using lazy loaded

    public static DbSingletonLazyLoaded getInstance(){
        if(instance == null){
            instance = new DbSingletonLazyLoaded();
        }
        return instance;
    }
}
