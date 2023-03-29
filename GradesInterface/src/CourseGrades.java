public class CourseGrades implements Analyzable {
    GradedActivity[] grades = new GradedActivity[4];

    public void setLab(GradedActivity activity) {
        grades[0] = activity;
    }

    public void setPassFailExam(PassFailExam passFailExam) {
        grades[1] = passFailExam;
    }

    public void setEssay(Essay essay) {
        grades[2] = essay;
    }

    public void setFinalExam(FinalExam finalExam) {
        grades[3] = finalExam;
    }

    public String toString() {
        String message = "";
        for (GradedActivity g : grades) {
            message += g + "\n";
        }
        return message;
    }

    @Override
    public double getAverage() {
        return (grades[0].getScore() + grades[2].getScore()) / 2;
    }

    @Override
    public GradedActivity getHighest() {
        return grades[0].getScore() > grades[2].getScore() ? grades[0] : grades[2];
    }

    @Override
    public GradedActivity getLowest() {
        return grades[0].getScore() < grades[2].getScore() ? grades[0] : grades[2];
    }
}