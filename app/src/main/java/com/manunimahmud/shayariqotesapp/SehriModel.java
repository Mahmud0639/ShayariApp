package com.manunimahmud.shayariqotesapp;

public class SehriModel {
    private String text;

    public SehriModel(String text){
        this.text = text;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
}