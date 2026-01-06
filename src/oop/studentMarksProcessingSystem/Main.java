package oop.studentMarksProcessingSystem;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("90000","His Name");
        System.out.println("Student Name : "+student.getName());
        System.out.println("Student ID   : "+student.getId());

        double [] marks = {80, 70, 60, 90, 40};
        String [] subjects = {"English","Science","Sinhala","Maths","History"};

        ExamResult examResult = new ExamResult(student,marks,subjects);
        System.out.println("Total : "+examResult.getTotal());
        System.out.println("Average : "+ examResult.getAverage());
        examResult.getGrade();
    }
}
