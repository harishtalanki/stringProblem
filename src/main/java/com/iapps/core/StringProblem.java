package com.iapps.core;

/**
 * Created by HARISHA.TALANKI on 10/22/2016.
 */
public class StringProblem {
    private String s;
    private Character ch;

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public Character getCh() {
        return ch;
    }

    public void setCh(Character ch) {
        this.ch = ch;
    }

    public StringProblem(String s, Character ch){
        if((s != null) && (s != "")){
            this.s = s.toLowerCase();
            this.ch = Character.toLowerCase(ch);
        }
    }

    public String replaceCharacter(){
        String finalString="";
        if((s != null) && (s != "")){
            for(Character c: this.s.toCharArray()){
                if(!(c.equals(this.ch))){
                    finalString+=c;
                }
            }
        }
        return finalString;
    }

    public String replaceCharacterStringClass(){
        String finalString="";
        if((s != null) && (s != "")){
            finalString = this.s.replaceAll(this.ch.toString(), "");
        }
        return finalString;
    }
}
