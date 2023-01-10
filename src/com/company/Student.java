package com.company;

public class Student extends Person{
    private Grade[] grades;

    public Student (Person person,Grade[] grades){
        super(person.getName(), person.getAge());
        this.grades= grades;
    }

    public double[] scoreByProff(String profession){
        int sum=0,count=0;
        for (Grade gr:this.grades) {

               if(gr != null && gr.getProfession().equals(profession))
               {
                   sum += gr.getScore();
                   count++;
               }

        }
        return  new double[]{sum,count};
    }


    public Grade[] getGrades() {
        return grades;
    }
    public double studentavg(){
        double sum=0;
        for (Grade grade:grades
             ) {
            sum+=grade.getScore();
        }
        return sum/ grades.length;

    }
    public void setGrades(Grade[] grades){
        this.grades=grades;
    }
}
