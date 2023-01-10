package com.company;

import java.util.Arrays;

public class Grade {

    private String profession  ;

    private int score;

    public Grade(String profession, int score){
        this.profession=profession;

        this.score=score;
    }

    public String getProfession(){
        return profession;
    }
    public int getScore(){
        return score;
    }
    public void setProfession(String profession){
        this.profession=profession;
    }
    public void setScore(int score){
        this.score=score;
    }



    @Override
    public String toString() {
        return "            profession =" + profession + "      score=" + score + "\n";
    }
}

