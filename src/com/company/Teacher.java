package com.company;

import java.util.Arrays;

public class Teacher extends  Person{
    private String[] profession={"math", "chemistry", "geography", "literature", "physics", "sports"};

    public Teacher(Person n ,String professions){
        super(n.getName(), n.getAge());
        setProfession(profession);
    }

    public String[] getProfession(){
        return profession;
    }
    public void setProfession(String[] profession){
        this.profession=profession;
    }


    @Override
    public String toString() {
        return "Teacher:" +
                "profession=" + profession +"\n"+
                super.toString();
    }
}

