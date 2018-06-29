package com.pluralsight.singleton;

/*
Example for simple Singleton implementation with eagerly loaded & not thread safe
*/
public class DbSingletonSimple {

    //private static instance so that the application can get only once instance of an object
    private static DbSingletonSimple instance = new DbSingletonSimple();

    //private constructor so that no one else can create an instance of this class
    private DbSingletonSimple(){}

    //public method to call the only instance that is created by singleton
    public static DbSingletonSimple getInstance(){
        return instance;
    }
}
