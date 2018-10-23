package com.company;

public class Words {
    public String[] possiblewords = new String[]{"Roskilde","Universitet","Genius","Intelligent","Hundige","Ali","Hussain","Zahra","Karbala" };
    public String word;

    public Words(int i){
        word = possiblewords[i];
    }

    public void print(){
        System.out.println(word);
    }

}