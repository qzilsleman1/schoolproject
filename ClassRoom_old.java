public class ClassRoom {
    private String name;
    private Teacher teacher;
    private Student[] studnts;

    public ClassRoom(String name,Teacher teacher,Student[] studnts) {
        this.name = name;
        this.teacher =teacher;
        studnts=new Student[15];
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public Teacher getTeacher(){
        return teacher;
    }
    public void setTeacher(Teacher teacher){
        this.teacher=teacher;
    }

    public Student[] getStudnts(){
        return studnts;
    }
    public void setStudnts(Student[] studnts){
        this.studnts=studnts;
    }

}
