package com.company;

public class School {
    private ClassRoom[] classRooms;
    private int numberinclass;

    public School(ClassRoom[] classrom){
        this.classRooms=classrom;
        numberinclass= schoolNumOfStudents();
    }
    public  int schoolNumOfStudents()
    {
        int sum=0;
        for (ClassRoom classroom:classRooms) {
            if(classroom != null)
            {
                sum+=classroom.Classlength();
            }

        }return sum;
    }

    public ClassRoom[] getClassRooms() {
        return classRooms;
    }

    public void setClassRooms(ClassRoom[] classRooms) {
        this.classRooms = classRooms;
    }
    public double schoolAverage()
    {   double sum=0;
        int count=0;
        for (ClassRoom classRoom : classRooms) {
            sum+=classRoom.classAvg();
            count++;

    }
        return sum/count;



    }
    public double getScoreByProffesion(String proff){
        double[] count={0,0};
        for (ClassRoom cll:classRooms) {
            if (cll !=null)
            {
                double [] temp= cll.getavgpro(proff);
                count[0]+= temp[0];
                count[1]+= temp[1];
            }


        }
        return (count[0]/ count[1]);
    }
public void avgBetween(int age) {
    avgBetween(age, 120);
}
 public void avgBetween(int num1 , int num2 ) {
    double[] sum={0,0};
     for (ClassRoom classRoom:classRooms) {
         double[] temp = classRoom.avgbyage(num1,num2);
         if(temp[0] != 0) {
             sum[0] += temp[0];
             sum[1] += temp[1];


         }
         
     }
     System.out.printf("\nthe avg of the students that are between %d too %d years old is: %.2f",num1,num2, sum[0]/sum[1]);
 }
 public  void AvgAgeAllSchool()
 {
     int sum=0;
     for (ClassRoom classroom:classRooms)
     {
         if(classroom!=null)
         {
             sum+=classroom.AgeAvgClass();
         }


     }System.out.printf("\nthe avg age of the school is :%.2f",((double)sum/numberinclass));
 }
 public int NumberOfTeachets (String prff){
        int count =0 ;
     for (ClassRoom classroom:classRooms) {
         if (classroom != null){
             count += classroom.NumberOfTeachets(prff);

         }

     }
     return count;
 }
    

    @Override
    public String toString() {
        String str = "";
        for (ClassRoom cl:classRooms ) {
        str+= cl.toString();
        }
        return str;
    }
}
