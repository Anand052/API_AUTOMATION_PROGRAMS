package com.api.automation;

public class BuilderPatternDesignPatternJava {
    // Change return type of each method as Class type
    // "this" always points to current/calling object. Returning the same to have same reference

    public BuilderPatternDesignPatternJava Floor1(){
        System.out.println("Floor1 is done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor2(String parm){
        System.out.println("Floor2 is done");
        return this;
    }

    public BuilderPatternDesignPatternJava Floor3(){
        System.out.println("Floor3 is done");
        return this;
    }

    public static void main(String[] args){
        BuilderPatternDesignPatternJava bp = new BuilderPatternDesignPatternJava();
        bp.Floor1().Floor2("Anand").Floor3();
    }


}
