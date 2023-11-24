package com.codelounge.beans;

public class TestReflection {

    private int a;
    private  int b;

    public TestReflection(){

    }
    public TestReflection(int a, int b){
        this.a=a;
        this.b=b;

    }

    public String toString(){
        return "Test (a="+a+"b"+b+")";
    }

}
