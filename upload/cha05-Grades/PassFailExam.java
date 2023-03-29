public class PassFailExam extends GradedActivity{
    private double score;
    public void setScore( double s ){
        this.score = s;
    }
    public double getScore( ){
        return this.score;
    }
      public String toString( ){
        return "PassFail Exam Score is: " + this.score;
    }
}