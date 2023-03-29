public class FinalExam extends GradedActivity{

    private double score;

    public void setScore( double score ){
        this.score = score;
    }

    public double getScore( ){
        return this.score;
    }
      public String toString( ){
        return "Final Exam Score is: " + this.score;
    }
}