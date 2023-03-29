
class Demo {
    public static void main(String[] args) {

        CourseGrades grades = new CourseGrades();

        GradedActivity activity = new GradedActivity();
        activity.setScore(50);

        FinalExam finalExam = new FinalExam();
        finalExam.setScore(36);

        Essay essay = new Essay();
        essay.setScore(90);

        PassFailExam passFailExam = new PassFailExam();
        passFailExam.setScore(18);

        grades.setLab(activity);

        grades.setFinalExam(finalExam);

        grades.setEssay(essay);

        grades.setPassFailExam(passFailExam);

        System.out.println(grades);

        System.out.println("average is:" + grades.getAverage());
        System.out.println("Highest is: "+grades.getHighest().getScore());
        System.out.println("Lowest is: "+grades.getLowest().getScore());

    }

}