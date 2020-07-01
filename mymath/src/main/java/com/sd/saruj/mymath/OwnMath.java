package com.sd.saruj.mymath;

public class OwnMath {

    public static int plus(int a, int b){
        return a+b ;
    }

    public static int minus(int a, int b){
        return a-b ;
    }

    public static int multification(int a, int b){
        return a*b ;
    }

    public static float division(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Div by zero error") ;
        }
        else
            return a/b ;
    }
}
