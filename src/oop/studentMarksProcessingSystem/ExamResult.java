package oop.studentMarksProcessingSystem;

public class ExamResult {
    private final Student student;
    private final double[] marks;
    private final String [] subject;

    private double totalMarks;
    public ExamResult(Student student, double [] marks, String [] subject){
        if (marks == null || marks.length == 0){
            throw new IllegalArgumentException("Marks Array Cant be Null or Empty");
        }

        for (double m: marks){
            if (m>100 || m<0){
                throw new IllegalArgumentException("Marks rang is 0 - 100");
            }
        }

        if (subject == null || subject.length == 0){
            throw  new IllegalArgumentException("Subject Array cant be Null or Empty");
        }

        if (student==null){
            throw new IllegalArgumentException("Student Object cant be null");
        }

        if (marks.length != subject.length){
            throw new IllegalArgumentException("Array length not Equal");
        }

        this.student =student;
        this.marks = marks.clone();
        this.subject = subject.clone();

        calculateTotalMarks();
    }

    private void calculateTotalMarks(){
        for (double m: marks){
            totalMarks+=m;
        }
    }

    public double getAverage(){
        return totalMarks/subject.length;
    }

    public double getTotal() {
        return totalMarks;

    }

    public void getGrade(){
        System.out.println("----------Grade Report---------");
        System.out.println("Subject                 Grade");
        int i = 0;
        for (String subject: subject){
            System.out.print(subject+"                  ");
            double mark = marks[i];
            if (mark>75){
                System.out.println('A');
            }
            else if (mark>65){
                System.out.println('B');
            }
            else if (mark>55) {
                System.out.println('C');
            }
            else {
                System.out.println('W');
            }
            i++;
        }
    }



}
