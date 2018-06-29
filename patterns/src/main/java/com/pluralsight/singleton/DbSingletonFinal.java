package com.pluralsight.singleton;

/*
Example for simple Singleton implementation with lazy loaded & thread safe
*/
public class DbSingletonFinal {

    /*private static instance so that the application can get only once instance of an object,
    including volatile keyword so that the value of this variable will never be cached thread-locally*/

    private static volatile DbSingletonFinal instance = null;

    /*private constructor so that no one else can create an instance of this class, also ensuring
     that the reflection doesn't be able to create an instance*/

    private DbSingletonFinal() {
        if (instance != null) {
            throw new RuntimeException("Cannot create an instance for singleton, please use getInstance method!");
        }
    }

    /*public method to call the only instance that is created by singleton using lazy loaded,
    we can use 'synchronised' at class level also, but that would have performance impact*/

    public static DbSingletonFinal getInstance() {
        //lazy loading, create an instance only if the instance is null
        if (instance == null) {
            //using synchronized only when required not on the whole method
            synchronized (DbSingletonFinal.class){
                //null check one more time just to ensure that no 2 threads are going to create the instance
                if (instance == null) {
                    instance = new DbSingletonFinal();
                }
            }
        }
        return instance;
    }
}
