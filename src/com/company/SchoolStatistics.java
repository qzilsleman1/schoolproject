package com.company;
import java.lang.String;
import java.util.Random;

public class SchoolStatistics {
    public static void main(String[] args) {
        School school ;

        ClassRoom[] classRooms = new ClassRoom[5];
        Student[] studnts = new Student[15];
        Grade[] grades = new Grade[6];
        Teacher teacher = null;
        Random rand = new Random();
        String[] proo = new String[] {"math", "chemistry", "geography", "literature", "physics", "sports"};
        int i;
        for (i = 0; i < classRooms.length; i++) {
            teacher = new Teacher(new Person("Teacher" + i, rand.nextInt(20, 120)), proo[rand.nextInt(5)]);
            studnts = new Student[15];
            for (int x = 0; x < studnts.length; x++) {
                grades = new Grade[6];
                for (int g = 0; g < grades.length; g++) {
                    grades[g] = new Grade(proo[g], rand.nextInt(40, 100));
                }
                studnts[x] = new Student(new Person("student" + (x + 1), rand.nextInt(20, 120)), grades);

            }
            classRooms[i] = new ClassRoom("classroom" + (i + 1), teacher, studnts);

        }
        school = new School(classRooms);


        System.out.println(school);
         classroomAvg(school);
        schoolAverag(school);
        avgbypro(school);
        school.avgBetween(20,30);
        System.out.printf("\n");
        school.avgBetween(30,120);
        System.out.printf("\n");
        school.AvgAgeAllSchool();
      //  System.out.printf("number of teachers that teach physics,math is: %d \n", school.NumberOfTeachets("math")+school.NumberOfTeachets("physics"));
    }


    public static void schoolAverag(School school){
        System.out.println("\nthe school average is:"+school.schoolAverage());

    }
    public static void classroomAvg(School school) {

        ClassRoom[] classRooms = school.getClassRooms();
        for (ClassRoom classRoom : classRooms) {
            System.out.printf("\n %s  avg of this class = %.2f", classRoom.getName(), classRoom.classAvg());
        }
    }
        public static void avgbypro(School school)
        {
            String[] soso = new String[] {"math", "chemistry", "geography", "literature", "physics", "sports"};
            for (String string:soso
                 ) {
                System.out.printf("\n %s Avarge is :%.2f",string,school.getScoreByProffesion(string));

            }
        }
        /*"C:\Program Files\Java\jdk-17.0.2\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=54587:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\sleman\schoolproject\out\production\schoolproject com.company.SchoolStatistics
classroom1
      Teacher:profession=[Ljava.lang.String;@b4c966a
Person{name='Teacher0', age=68}      info of the student:
        student1     age:42
            profession =math      score=68
            profession =chemistry      score=41
            profession =geography      score=91
            profession =literature      score=79
            profession =physics      score=63
            profession =sports      score=54
        student2     age:114
            profession =math      score=79
            profession =chemistry      score=85
            profession =geography      score=55
            profession =literature      score=56
            profession =physics      score=47
            profession =sports      score=58
        student3     age:112
            profession =math      score=70
            profession =chemistry      score=96
            profession =geography      score=56
            profession =literature      score=46
            profession =physics      score=99
            profession =sports      score=66
        student4     age:95
            profession =math      score=47
            profession =chemistry      score=78
            profession =geography      score=50
            profession =literature      score=91
            profession =physics      score=71
            profession =sports      score=60
        student5     age:36
            profession =math      score=94
            profession =chemistry      score=61
            profession =geography      score=46
            profession =literature      score=87
            profession =physics      score=48
            profession =sports      score=95
        student6     age:86
            profession =math      score=73
            profession =chemistry      score=73
            profession =geography      score=95
            profession =literature      score=58
            profession =physics      score=57
            profession =sports      score=97
        student7     age:112
            profession =math      score=84
            profession =chemistry      score=43
            profession =geography      score=43
            profession =literature      score=74
            profession =physics      score=69
            profession =sports      score=42
        student8     age:69
            profession =math      score=94
            profession =chemistry      score=48
            profession =geography      score=86
            profession =literature      score=48
            profession =physics      score=48
            profession =sports      score=66
        student9     age:50
            profession =math      score=46
            profession =chemistry      score=47
            profession =geography      score=80
            profession =literature      score=71
            profession =physics      score=65
            profession =sports      score=94
        student10     age:32
            profession =math      score=72
            profession =chemistry      score=76
            profession =geography      score=82
            profession =literature      score=42
            profession =physics      score=67
            profession =sports      score=64
        student11     age:45
            profession =math      score=75
            profession =chemistry      score=82
            profession =geography      score=61
            profession =literature      score=55
            profession =physics      score=65
            profession =sports      score=61
        student12     age:48
            profession =math      score=93
            profession =chemistry      score=46
            profession =geography      score=63
            profession =literature      score=81
            profession =physics      score=88
            profession =sports      score=64
        student13     age:68
            profession =math      score=90
            profession =chemistry      score=57
            profession =geography      score=93
            profession =literature      score=81
            profession =physics      score=92
            profession =sports      score=49
        student14     age:72
            profession =math      score=91
            profession =chemistry      score=59
            profession =geography      score=89
            profession =literature      score=50
            profession =physics      score=47
            profession =sports      score=99
        student15     age:70
            profession =math      score=81
            profession =chemistry      score=86
            profession =geography      score=78
            profession =literature      score=51
            profession =physics      score=62
            profession =sports      score=45
classroom2
      Teacher:profession=[Ljava.lang.String;@b1bc7ed
Person{name='Teacher1', age=72}      info of the student:
        student1     age:24
            profession =math      score=44
            profession =chemistry      score=69
            profession =geography      score=84
            profession =literature      score=62
            profession =physics      score=77
            profession =sports      score=87
        student2     age:97
            profession =math      score=91
            profession =chemistry      score=96
            profession =geography      score=86
            profession =literature      score=47
            profession =physics      score=68
            profession =sports      score=53
        student3     age:72
            profession =math      score=43
            profession =chemistry      score=41
            profession =geography      score=42
            profession =literature      score=97
            profession =physics      score=61
            profession =sports      score=98
        student4     age:30
            profession =math      score=90
            profession =chemistry      score=42
            profession =geography      score=41
            profession =literature      score=45
            profession =physics      score=57
            profession =sports      score=89
        student5     age:78
            profession =math      score=64
            profession =chemistry      score=91
            profession =geography      score=75
            profession =literature      score=67
            profession =physics      score=80
            profession =sports      score=93
        student6     age:85
            profession =math      score=44
            profession =chemistry      score=58
            profession =geography      score=84
            profession =literature      score=70
            profession =physics      score=53
            profession =sports      score=79
        student7     age:105
            profession =math      score=62
            profession =chemistry      score=79
            profession =geography      score=79
            profession =literature      score=97
            profession =physics      score=64
            profession =sports      score=73
        student8     age:50
            profession =math      score=42
            profession =chemistry      score=51
            profession =geography      score=87
            profession =literature      score=71
            profession =physics      score=53
            profession =sports      score=97
        student9     age:67
            profession =math      score=64
            profession =chemistry      score=44
            profession =geography      score=49
            profession =literature      score=60
            profession =physics      score=93
            profession =sports      score=82
        student10     age:26
            profession =math      score=71
            profession =chemistry      score=82
            profession =geography      score=95
            profession =literature      score=53
            profession =physics      score=45
            profession =sports      score=68
        student11     age:77
            profession =math      score=50
            profession =chemistry      score=54
            profession =geography      score=72
            profession =literature      score=41
            profession =physics      score=69
            profession =sports      score=81
        student12     age:65
            profession =math      score=63
            profession =chemistry      score=64
            profession =geography      score=90
            profession =literature      score=79
            profession =physics      score=70
            profession =sports      score=54
        student13     age:48
            profession =math      score=60
            profession =chemistry      score=40
            profession =geography      score=96
            profession =literature      score=45
            profession =physics      score=48
            profession =sports      score=52
        student14     age:46
            profession =math      score=71
            profession =chemistry      score=70
            profession =geography      score=93
            profession =literature      score=76
            profession =physics      score=50
            profession =sports      score=45
        student15     age:60
            profession =math      score=90
            profession =chemistry      score=68
            profession =geography      score=93
            profession =literature      score=58
            profession =physics      score=45
            profession =sports      score=90
classroom3
      Teacher:profession=[Ljava.lang.String;@7cd84586
Person{name='Teacher2', age=61}      info of the student:
        student1     age:57
            profession =math      score=87
            profession =chemistry      score=73
            profession =geography      score=80
            profession =literature      score=75
            profession =physics      score=79
            profession =sports      score=64
        student2     age:61
            profession =math      score=52
            profession =chemistry      score=55
            profession =geography      score=98
            profession =literature      score=58
            profession =physics      score=63
            profession =sports      score=84
        student3     age:30
            profession =math      score=72
            profession =chemistry      score=70
            profession =geography      score=44
            profession =literature      score=41
            profession =physics      score=61
            profession =sports      score=78
        student4     age:61
            profession =math      score=58
            profession =chemistry      score=63
            profession =geography      score=80
            profession =literature      score=86
            profession =physics      score=62
            profession =sports      score=60
        student5     age:92
            profession =math      score=62
            profession =chemistry      score=54
            profession =geography      score=54
            profession =literature      score=57
            profession =physics      score=76
            profession =sports      score=45
        student6     age:87
            profession =math      score=85
            profession =chemistry      score=55
            profession =geography      score=65
            profession =literature      score=92
            profession =physics      score=62
            profession =sports      score=82
        student7     age:30
            profession =math      score=53
            profession =chemistry      score=66
            profession =geography      score=84
            profession =literature      score=73
            profession =physics      score=84
            profession =sports      score=42
        student8     age:33
            profession =math      score=51
            profession =chemistry      score=50
            profession =geography      score=65
            profession =literature      score=96
            profession =physics      score=40
            profession =sports      score=84
        student9     age:118
            profession =math      score=47
            profession =chemistry      score=43
            profession =geography      score=84
            profession =literature      score=60
            profession =physics      score=80
            profession =sports      score=74
        student10     age:25
            profession =math      score=82
            profession =chemistry      score=96
            profession =geography      score=66
            profession =literature      score=79
            profession =physics      score=74
            profession =sports      score=52
        student11     age:37
            profession =math      score=74
            profession =chemistry      score=55
            profession =geography      score=41
            profession =literature      score=73
            profession =physics      score=79
            profession =sports      score=94
        student12     age:78
            profession =math      score=98
            profession =chemistry      score=44
            profession =geography      score=61
            profession =literature      score=54
            profession =physics      score=88
            profession =sports      score=92
        student13     age:90
            profession =math      score=68
            profession =chemistry      score=59
            profession =geography      score=75
            profession =literature      score=58
            profession =physics      score=89
            profession =sports      score=92
        student14     age:36
            profession =math      score=93
            profession =chemistry      score=81
            profession =geography      score=53
            profession =literature      score=88
            profession =physics      score=64
            profession =sports      score=45
        student15     age:65
            profession =math      score=81
            profession =chemistry      score=71
            profession =geography      score=40
            profession =literature      score=76
            profession =physics      score=99
            profession =sports      score=45
classroom4
      Teacher:profession=[Ljava.lang.String;@30dae81
Person{name='Teacher3', age=34}      info of the student:
        student1     age:36
            profession =math      score=97
            profession =chemistry      score=64
            profession =geography      score=84
            profession =literature      score=73
            profession =physics      score=83
            profession =sports      score=56
        student2     age:59
            profession =math      score=46
            profession =chemistry      score=80
            profession =geography      score=58
            profession =literature      score=96
            profession =physics      score=56
            profession =sports      score=58
        student3     age:75
            profession =math      score=89
            profession =chemistry      score=53
            profession =geography      score=80
            profession =literature      score=41
            profession =physics      score=58
            profession =sports      score=60
        student4     age:75
            profession =math      score=88
            profession =chemistry      score=87
            profession =geography      score=73
            profession =literature      score=95
            profession =physics      score=97
            profession =sports      score=99
        student5     age:34
            profession =math      score=53
            profession =chemistry      score=53
            profession =geography      score=44
            profession =literature      score=78
            profession =physics      score=49
            profession =sports      score=83
        student6     age:98
            profession =math      score=90
            profession =chemistry      score=51
            profession =geography      score=83
            profession =literature      score=79
            profession =physics      score=42
            profession =sports      score=42
        student7     age:57
            profession =math      score=50
            profession =chemistry      score=45
            profession =geography      score=47
            profession =literature      score=79
            profession =physics      score=62
            profession =sports      score=58
        student8     age:68
            profession =math      score=49
            profession =chemistry      score=78
            profession =geography      score=94
            profession =literature      score=78
            profession =physics      score=96
            profession =sports      score=99
        student9     age:32
            profession =math      score=70
            profession =chemistry      score=58
            profession =geography      score=78
            profession =literature      score=99
            profession =physics      score=54
            profession =sports      score=58
        student10     age:55
            profession =math      score=84
            profession =chemistry      score=41
            profession =geography      score=67
            profession =literature      score=92
            profession =physics      score=83
            profession =sports      score=90
        student11     age:22
            profession =math      score=93
            profession =chemistry      score=94
            profession =geography      score=42
            profession =literature      score=48
            profession =physics      score=46
            profession =sports      score=80
        student12     age:35
            profession =math      score=89
            profession =chemistry      score=46
            profession =geography      score=93
            profession =literature      score=57
            profession =physics      score=47
            profession =sports      score=72
        student13     age:84
            profession =math      score=50
            profession =chemistry      score=42
            profession =geography      score=52
            profession =literature      score=82
            profession =physics      score=60
            profession =sports      score=43
        student14     age:45
            profession =math      score=90
            profession =chemistry      score=77
            profession =geography      score=95
            profession =literature      score=94
            profession =physics      score=49
            profession =sports      score=85
        student15     age:92
            profession =math      score=51
            profession =chemistry      score=96
            profession =geography      score=80
            profession =literature      score=65
            profession =physics      score=66
            profession =sports      score=82
classroom5
      Teacher:profession=[Ljava.lang.String;@1b2c6ec2
Person{name='Teacher4', age=57}      info of the student:
        student1     age:20
            profession =math      score=76
            profession =chemistry      score=94
            profession =geography      score=70
            profession =literature      score=75
            profession =physics      score=97
            profession =sports      score=98
        student2     age:29
            profession =math      score=96
            profession =chemistry      score=94
            profession =geography      score=58
            profession =literature      score=57
            profession =physics      score=53
            profession =sports      score=99
        student3     age:114
            profession =math      score=47
            profession =chemistry      score=69
            profession =geography      score=48
            profession =literature      score=82
            profession =physics      score=93
            profession =sports      score=90
        student4     age:49
            profession =math      score=61
            profession =chemistry      score=83
            profession =geography      score=78
            profession =literature      score=58
            profession =physics      score=60
            profession =sports      score=77
        student5     age:46
            profession =math      score=84
            profession =chemistry      score=66
            profession =geography      score=47
            profession =literature      score=89
            profession =physics      score=46
            profession =sports      score=73
        student6     age:83
            profession =math      score=71
            profession =chemistry      score=48
            profession =geography      score=42
            profession =literature      score=41
            profession =physics      score=87
            profession =sports      score=56
        student7     age:26
            profession =math      score=67
            profession =chemistry      score=84
            profession =geography      score=62
            profession =literature      score=97
            profession =physics      score=64
            profession =sports      score=41
        student8     age:54
            profession =math      score=96
            profession =chemistry      score=55
            profession =geography      score=40
            profession =literature      score=67
            profession =physics      score=41
            profession =sports      score=55
        student9     age:75
            profession =math      score=44
            profession =chemistry      score=71
            profession =geography      score=86
            profession =literature      score=84
            profession =physics      score=86
            profession =sports      score=69
        student10     age:20
            profession =math      score=61
            profession =chemistry      score=69
            profession =geography      score=72
            profession =literature      score=92
            profession =physics      score=80
            profession =sports      score=44
        student11     age:112
            profession =math      score=88
            profession =chemistry      score=72
            profession =geography      score=87
            profession =literature      score=57
            profession =physics      score=40
            profession =sports      score=40
        student12     age:48
            profession =math      score=57
            profession =chemistry      score=41
            profession =geography      score=53
            profession =literature      score=63
            profession =physics      score=93
            profession =sports      score=50
        student13     age:89
            profession =math      score=63
            profession =chemistry      score=53
            profession =geography      score=83
            profession =literature      score=94
            profession =physics      score=50
            profession =sports      score=53
        student14     age:58
            profession =math      score=73
            profession =chemistry      score=41
            profession =geography      score=50
            profession =literature      score=98
            profession =physics      score=70
            profession =sports      score=69
        student15     age:105
            profession =math      score=93
            profession =chemistry      score=80
            profession =geography      score=50
            profession =literature      score=60
            profession =physics      score=79
            profession =sports      score=68


 classroom1  avg of this class = 68.61
 classroom2  avg of this class = 67.84
 classroom3  avg of this class = 68.74
 classroom4  avg of this class = 69.92
 classroom5  avg of this class = 68.42
the school average is:68.7088888888889

 math Avarge is :71.13
 chemistry Avarge is :64.63
 geography Avarge is :69.60
 literature Avarge is :70.32
 physics Avarge is :66.77
 sports Avarge is :69.80
the avg of the students that are between 20 too 30 years old is: 70.02

the avg of the students that are between 30 too 120 years old is: 68.23

the avg age of the school is :62.35
Process finished with exit code 0
*/

    }

















