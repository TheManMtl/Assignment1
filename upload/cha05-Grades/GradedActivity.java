public class GradedActivity{

    private double score;

    public void setScore( double score ){
        this.score = score;
    }
    public double getScore( ){
        return this.score;
    }

    public String toString( ){
        return "Lab Activity Score is: " + this.score;
    }
}