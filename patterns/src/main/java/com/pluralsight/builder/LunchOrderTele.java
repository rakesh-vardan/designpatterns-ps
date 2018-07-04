package com.pluralsight.builder;

//using telescoping constructor approach
public class LunchOrderTele {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread){
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String condiments){
        this(bread);
        this.condiments = condiments;
    }

    public LunchOrderTele(String bread, String condiments, String dressing){
        this(bread, condiments);
        this.dressing = dressing;
    }

    //we need one more constructor if we need a lunch only with bread and meat !
    public LunchOrderTele(String bread, String condiments, String dressing, String meat){
        this(bread, condiments, dressing);
        this.meat = meat;
    }

    public String getBread(){
        return bread;
    }

    public String getCondiments(){
        return condiments;
    }

    public String getDressing(){
        return dressing;
    }

    public String getMeat(){
        return meat;
    }
}
