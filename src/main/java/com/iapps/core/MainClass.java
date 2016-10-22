package com.iapps.core;

/**
 * Created by HARISHA.TALANKI on 10/22/2016.
 */
public class MainClass {
    public static void main(String[] args){
        StringProblem s = new StringProblem("aaaaaaaaafsdfAAAdaaaa", 'a');

        System.out.println("Actual:"+ s.getS()+"\tSubstituting: "+s.getCh());
        System.out.println("(without string class): "+s.replaceCharacter());
        System.out.println("(Using string class): "+s.replaceCharacterStringClass());
    }
}
