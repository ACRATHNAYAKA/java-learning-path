package oop.studentMarksProcessingSystem;

public class ExamResult {
    private final Student student;
    private double[] marks = new double[5];
    private String [] subject = new String[5];

    private double totalMarks;
    public ExamResult(Student student, double [] marks, String [] subject){
        if (marks == null || marks.length == 0){
            throw new IllegalArgumentException("Marks Array Cant be Null or Empty");
        }
        if (subject == null || subject.length == 0){
            throw  new IllegalArgumentException("Subject Array cant be Null or Empty");
        }

        this.student =student;
        this.marks = marks;
        this.subject = subject;
    }

    private void calculateTotalMarks(){
        for (double marks: marks){
            totalMarks+=marks;
        }
    }

    public double getAverage(){
        return totalMarks/5;
    }

    public double getTotal(){
        return totalMarks;
    }



}
