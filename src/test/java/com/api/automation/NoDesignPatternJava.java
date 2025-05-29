package com.api.automation;

public class NoDesignPatternJava {

    public void Floor1(){
        System.out.println("Floor 1");
    }

    public void Floor2(){
        System.out.println("Floor 2");
    }

    public void Floor3(String param){
        System.out.println("Floor 3");
    }

    public static void main(String[] args){

        NoDesignPatternJava np = new NoDesignPatternJava();
        np.Floor1();
        np.Floor2();
        np.Floor3("Anand");
    }
}
