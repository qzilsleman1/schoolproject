public class Grade {
    private String profession;
    private  String[] corsses={"math", "chemistry", "geography", "literature", "physics", "sports"};
    private int score;

    public Grade(String profession,String[] corsses,int score){
        this.profession=profession;
        this.corsses=corsses;
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

}
