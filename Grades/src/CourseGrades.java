public class CourseGrades {
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
            message += g +"\n";
        }
        return message;
    }
}