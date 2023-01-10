package com.company;

import java.util.Arrays;

public class ClassRoom {
    private String[] profession={"math", "chemistry", "geography", "literature", "physics", "sports"};
    private String name;
    private Teacher teacher;
    private Student[] studnts;

    public ClassRoom(String name, Teacher teacher, Student[] studnts) {
        this.name = name;
        this.teacher = teacher;
        this.studnts = studnts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudnts() {
        return studnts;
    }

    public void setStudnts(Student[] studnts) {
        this.studnts = studnts;
    }
    public double[] getavgpro(String gv)
    {
        double[] counter ={0,0};
        for (Student student: studnts) {
            if(student != null)
            {
                double[] i = student.scoreByProff(gv);
                counter[0]+= i[0];
                counter[1]+= i[1];
            }

        }return  counter;
    }

    public double classAvg() {
        double sum = 0;
        int studentcount = 0;
        for (Student i : studnts) {
            if (i != null) {
                sum += i.studentavg();
                studentcount++;
            }
        }
        return sum / studentcount;
    }
public double[] avgbyage(int num1,int num2)
{
    double sum=0;
            int count =0;
    for (Student string:studnts) {
        if(string != null && string.getAge()>=num1&&string.getAge()<=num2)
        {
            sum += (string.studentavg());
            count++;
        }

    }return new double[]{sum,count};

}
    public int NumberOfTeachets(String prff){
        if(teacher != null && teacher.getProfession().equals(prff)){
            return 1;}
        else {
            return 0;
        }
    }

    public int AgeAvgClass()
    {
        int sum=0;
        for (Student student:studnts)
            if(student!= null)
            sum+=student.getAge();
            return  sum;

    }
    public int Classlength()
    {return studnts.length;}
    @Override
    public String toString() {
       String print = "";
       print += name + "\n      " + teacher.toString()+  "      info of the student: \n";
        for (int i = 0; i < studnts.length; i++) {
            print+="        "+ studnts[i].getName() + "     age:" + studnts[i].getAge() + "\n";
            Grade[] point =studnts[i].getGrades();
            for (int j = 0; j < point.length; j++) {
                print += point[j].toString();

            }
        }
        return print;
    }
}


